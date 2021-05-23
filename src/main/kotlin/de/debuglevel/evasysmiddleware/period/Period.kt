package de.debuglevel.evasysmiddleware.period

import java.time.LocalDate

data class Period(
    val id: Int,
    val title: String,
    val start: LocalDate,
    val end: LocalDate,
)