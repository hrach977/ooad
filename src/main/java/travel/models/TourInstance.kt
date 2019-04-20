package travel.models

import java.time.LocalDateTime

data class TourInstance(
        var id: Long,
        var quota: Int,
        var dateTime: LocalDateTime,
        var travelers: MutableList<Traveler>,
        var tour: Tour,
        var guide: Guide
)