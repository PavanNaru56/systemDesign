package TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private int screenID;

    private List<Show> shows;

    public Screen(int screenID) {
        this.screenID = screenID;
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }
}
