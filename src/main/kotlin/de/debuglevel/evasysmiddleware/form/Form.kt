package de.debuglevel.evasysmiddleware.form

data class Form(
    val id: Int,
    val name: String,
    val ownerId: Int,
    val formEngine: Int,
    // TODO: CustomReportList
    // TODO: UsageRestrictionList
)
