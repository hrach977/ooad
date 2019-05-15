package travel.catalogs;

import travel.models.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationCatalog {
    private List<Reservation> reservations = new ArrayList<>();

    public Reservation findById(Long id) {
        return reservations.stream()
                .filter(it -> id.equals(it.getId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("reservation not found, id: " + id));
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}
