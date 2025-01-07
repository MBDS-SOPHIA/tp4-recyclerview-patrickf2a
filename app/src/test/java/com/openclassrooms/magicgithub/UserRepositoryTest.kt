package com.openclassrooms.magicgithub

import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM
import com.openclassrooms.magicgithub.di.Injection
import com.openclassrooms.magicgithub.model.User
import com.openclassrooms.magicgithub.repository.UserRepository
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Unit test, which will execute on a JVM.
 * Testing UserRepository.
 */
@RunWith(JUnit4::class)
class UserRepositoryTest {
    private lateinit var userRepository: UserRepository

    @Before
    fun setup() {
        userRepository = Injection.getRepository()
    }

    @Test
    fun getUsersWithSuccess() {
        val usersActual = userRepository.getUsers()
        val usersExpected: List<User> = FAKE_USERS
        assertEquals(
            usersActual,
            usersExpected
        )
    }

    @Test
    fun generateRandomUserWithSuccess() {
        val initialSize = userRepository.getUsers().size
        userRepository.addRandomUser()
        val user = userRepository.getUsers().last()
        assertEquals(userRepository.getUsers().size, initialSize + 1)
        assertTrue(
            FAKE_USERS_RANDOM.filter {
                it.equals(user)
            }.isNotEmpty()
        )
    }

    @Test
    fun deleteUserWithSuccess() {
        val userToDelete = userRepository.getUsers()[0]
        userRepository.deleteUser(userToDelete)
        Assert.assertFalse(userRepository.getUsers().contains(userToDelete))
    }

    @Test
    fun checkDefaultUserStatus() {
        val users = userRepository.getUsers()
        assertTrue("All users should be active by default", users.all { it.isActive })
    }

    @Test
    fun toggleUserStatusWithSuccess() {
        // Get first user and ensure it's active by default
        val user = userRepository.getUsers()[0]
        val initialStatus = user.isActive

        // Toggle status
        user.isActive = !initialStatus

        // Check if status was changed
        Assert.assertNotEquals(
            "User status should be toggled",
            initialStatus,
            user.isActive
        )
    }



    @Test
    fun checkRandomUserStatus() {
        userRepository.addRandomUser()
        val randomUser = userRepository.getUsers().last()
        assertTrue("Random user should be active by default", randomUser.isActive)
    }

    @Test
    fun maintainUserStatusAfterListOperations() {
        // Get a user and change its status
        val user = userRepository.getUsers()[0]
        user.isActive = false
        // Add a new random user
        userRepository.addRandomUser()
        // Check if the status is maintained
        Assert.assertFalse(
            "User status should be maintained after list operations",
            userRepository.getUsers().first().isActive
        )
    }

    @Test
    fun verifyActiveAndInactiveUsersCoexist() {
        // Get two users
        val users = userRepository.getUsers().take(2)
        // Set different statuses
        users[0].isActive = false
        users[1].isActive = true
        // Verify both statuses exist in the list
        assertTrue(
            "Repository should contain both active and inactive users",
            userRepository.getUsers().any { !it.isActive } &&
                    userRepository.getUsers().any { it.isActive }
        )
    }
}