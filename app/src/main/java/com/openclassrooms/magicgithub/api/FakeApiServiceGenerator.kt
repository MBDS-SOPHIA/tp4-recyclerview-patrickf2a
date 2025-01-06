package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://avatars.githubusercontent.com/u/1"),
        User("002", "Paul", "https://avatars.githubusercontent.com/u/2"),
        User("003", "Phil", "https://avatars.githubusercontent.com/u/3"),
        User("004", "Guillaume", "https://avatars.githubusercontent.com/u/4"),
        User("005", "Francis", "https://avatars.githubusercontent.com/u/5"),
        User("006", "George", "https://avatars.githubusercontent.com/u/6"),
        User("007", "Louis", "https://avatars.githubusercontent.com/u/7"),
        User("008", "Mateo", "https://avatars.githubusercontent.com/u/8"),
        User("009", "April", "https://avatars.githubusercontent.com/u/9"),
        User("010", "Louise", "https://avatars.githubusercontent.com/u/10"),
        User("011", "Elodie", "https://avatars.githubusercontent.com/u/11"),
        User("012", "Helene", "https://avatars.githubusercontent.com/u/12"),
        User("013", "Fanny", "https://avatars.githubusercontent.com/u/13"),
        User("014", "Laura", "https://avatars.githubusercontent.com/u/14"),
        User("015", "Gertrude", "https://avatars.githubusercontent.com/u/15"),
        User("016", "Chloé", "https://avatars.githubusercontent.com/u/16"),
        User("017", "April", "https://avatars.githubusercontent.com/u/17"),
        User("018", "Marie", "https://avatars.githubusercontent.com/u/18"),
        User("019", "Henri", "https://avatars.githubusercontent.com/u/19"),
        User("020", "Rémi", "https://avatars.githubusercontent.com/u/20")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://avatars.githubusercontent.com/u/21"),
        User("022", "Geoffrey", "https://avatars.githubusercontent.com/u/22"),
        User("023", "Simon", "https://avatars.githubusercontent.com/u/23"),
        User("024", "André", "https://avatars.githubusercontent.com/u/24"),
        User("025", "Leopold", "https://avatars.githubusercontent.com/u/25")
    )
}