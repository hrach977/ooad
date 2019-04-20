package travel.models.records

import travel.models.Guide
import java.time.LocalDateTime

data class TourInstanceRecord (
        var tourId: Long,
        var numOfParticipants: Int,
        var dateTime: LocalDateTime,
        var guide: Guide,
        var estimation: Double,
        var travelerRecords: List<TravelerRecord>
)