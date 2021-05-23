package de.debuglevel.evasysmiddleware.survey

import de.debuglevel.evasysmiddleware.period.Period
import java.util.*

data class Survey(
    private val id: Int,
    private val state: Int,
    private val title: String,
    private val type: String,
    private val formId: Int,
    private val studentId: Int,
    private val verId: Int,
    private val openState: Int,
    private val formCount: Int,
    private val pswdCount: Int,
    private val lastDataCollectionDate: Calendar,
    private val pageLinkOffset: Int,
    private val maskTan: String,
    private val maskState: Int,
    private val period: Period,
)