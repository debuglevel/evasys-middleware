package de.debuglevel.evasysmiddleware.subunit

import de.debuglevel.evasysmiddleware.user.User

data class Subunit(
    val id: Int,
    val name: String,
    val publicUnitNumber: Int,
    val imageAccess: Int,
    val users: Set<User>,
)