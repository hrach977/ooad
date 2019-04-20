package travel.models

data class Tour(
        var id: Long,
        var description: String,
        var duration: Int,
        var tourInstances: MutableList<TourInstance>
)