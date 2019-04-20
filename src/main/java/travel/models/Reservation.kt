package travel.models

data class Reservation(
        var tourId: Long,
        var numOfPassengers: Int,
        var tourInstance: TourInstance
)