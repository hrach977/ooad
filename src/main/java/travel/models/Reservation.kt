package travel.models

data class Reservation(
        val id: Long,
//        var tourId: Long,
        var numOfPassengers: Int,
        var tourInstance: TourInstance
)