package travel;

import travel.catalogs.GuideCatalog;
import travel.catalogs.ReservationCatalog;
import travel.catalogs.TourCatalog;
import travel.models.Reservation;
import travel.models.Tour;

public class Agency {
    private ReservationCatalog reservationCatalog;
    private TourCatalog tourCatalog;
    private Archive archive;
    private GuideCatalog guideCatalog;

//    public long makeReservation(long tourId, long tourInstanceId, int numOfParticipants) {
//        Tour tour = tourCatalog.getById(tourId);
//
//        long reservationId = System.currentTimeMillis();
////        Reservation reservation = new Reservation(reservationId, numOfParticipants)
//    }

}
