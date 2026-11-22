package TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private List<Theater> theaters;

    public City(String name) {
        this.name = name;
        this.theaters = new ArrayList<>();
    }

    public void addTheater(Theater theater) {
        theaters.add(theater);
    }

    public String getName() {
        return name;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }




}
