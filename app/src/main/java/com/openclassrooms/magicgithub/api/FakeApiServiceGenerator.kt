package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://avatars.githubusercontent.com/u/1", true),
        User("002", "Paul", "https://avatars.githubusercontent.com/u/2", true),
        User("003", "Phil", "https://avatars.githubusercontent.com/u/3", true),
        User("004", "Guillaume", "https://avatars.githubusercontent.com/u/4", true),
        User("005", "Francis", "https://avatars.githubusercontent.com/u/5", true),
        User("006", "George", "https://avatars.githubusercontent.com/u/6", true),
        User("007", "Louis", "https://avatars.githubusercontent.com/u/7", true),
        User("008", "Mateo", "https://avatars.githubusercontent.com/u/8", true),
        User("009", "April", "https://avatars.githubusercontent.com/u/9", true),
        User("010", "Louise", "https://avatars.githubusercontent.com/u/10", true),
        User("011", "Elodie", "https://avatars.githubusercontent.com/u/11", true),
        User("012", "Helene", "https://avatars.githubusercontent.com/u/12", true),
        User("013", "Fanny", "https://avatars.githubusercontent.com/u/13", true),
        User("014", "Laura", "https://avatars.githubusercontent.com/u/14", true),
        User("015", "Gertrude", "https://avatars.githubusercontent.com/u/15", true),
        User("016", "Chloé", "https://avatars.githubusercontent.com/u/16", true),
        User("017", "April", "https://avatars.githubusercontent.com/u/17", true),
        User("018", "Marie", "https://avatars.githubusercontent.com/u/18", true),
        User("019", "Henri", "https://avatars.githubusercontent.com/u/19", true),
        User("020", "Rémi", "https://avatars.githubusercontent.com/u/20", true)
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://avatars.githubusercontent.com/u/21", true),
        User("022", "Geoffrey", "https://avatars.githubusercontent.com/u/22", true),
        User("023", "Simon", "https://avatars.githubusercontent.com/u/23", true),
        User("024", "André", "https://avatars.githubusercontent.com/u/24", true),
        User("025", "Leopold", "https://avatars.githubusercontent.com/u/25", true)
    )
}