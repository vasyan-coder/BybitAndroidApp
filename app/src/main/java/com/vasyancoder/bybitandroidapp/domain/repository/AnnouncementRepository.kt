package com.vasyancoder.bybitandroidapp.domain.repository

import com.vasyancoder.bybitandroidapp.domain.model.Announcement
import java.util.Locale

/**
 * Repository interface defining the contract for obtaining announcement data.
 */
interface AnnouncementRepository {
    /**
     * Executes the use case to retrieve a list of announcements.
     *
     * @param locale The locale for which to retrieve announcements.
     * @param type Announcement type (optional).
     * @param tag Announcement tag (optional).
     * @param page Page number (optional).
     * @param limit Limit for data size per page (optional).
     * @return Result object containing either a list of announcements or an exception on failure.
     */
    suspend fun getAnnouncementList(
        locale: Locale,
        type: String?,
        tag: String?,
        page: Int?,
        limit: Int?,
    ): Result<List<Announcement>>
}
