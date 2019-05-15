package travel.catalogs;

import travel.models.Tour;

import java.util.List;

public class TourCatalog {
    private List<Tour> tours;

    public Tour getById(long id) {
        for (Tour t : tours) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
