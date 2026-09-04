package com.hiva.dailyplanner

data class Note(
    val id: Int = 0,
    val title: String,
    val content: String,
    val dateMillis: Long,
    val reminderMillis: Long? = null
)
