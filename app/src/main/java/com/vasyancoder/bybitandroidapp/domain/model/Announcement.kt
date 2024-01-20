package com.vasyancoder.bybitandroidapp.domain.model

/**
 * Data class representing an announcement with essential properties.
 *
 * @property title Announcement title.
 * @property description Announcement description.
 * @property type The type of the announcement, containing a title and a key.
 * @property tags The tags of announcement.
 * @property url Announcement url.
 * @property dateTimestamp Publish timestamp (ms) of announcement.
 * @property startDateTimestamp The start timestamp (ms) of the event, only valid when list.type.key == "latest_activities".
 * @property endDateTimestamp The end timestamp (ms) of the event, only valid when list.type.key == "latest_activities".
 */
data class Announcement(
    val title: String,
    val description: String,
    val type: AnnouncementType,
    val tags: List<String>,
    val url: String,
    val dateTimestamp: Long,
    val startDateTimestamp: Long,
    val endDateTimestamp: Long,
)

/**
 * Data class representing the type of an announcement with a title and a key.
 *
 * @property title The title of the announcement type.
 * @property key The key of the announcement type.
 */
data class AnnouncementType(
    val title: String,
    val key: String,
)
