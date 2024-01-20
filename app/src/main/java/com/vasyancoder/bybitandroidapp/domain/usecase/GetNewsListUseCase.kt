package com.vasyancoder.bybitandroidapp.domain.usecase

import com.vasyancoder.bybitandroidapp.domain.model.Announcement
import com.vasyancoder.bybitandroidapp.domain.repository.AnnouncementRepository
import java.util.Locale

/**
 * Use case class for obtaining a list of announcements.
 *
 * @property announcementRepository The repository for fetching announcements.
 */
class GetAnnouncementListUseCase(
    private val announcementRepository: AnnouncementRepository,
) {
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
    suspend operator fun invoke(
        locale: Locale,
        type: String?,
        tag: String?,
        page: Int?,
        limit: Int?,
    ): Result<List<Announcement>> {
        return announcementRepository.getAnnouncementList(
            locale = locale,
            type = type,
            tag = tag,
            page = page,
            limit = limit,
        )
    }
}
