package TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

//singleton class
public class BookingService {

    private static BookingService instance;

    private List<City> cities;

    private int bookingCounter=1;

    private BookingService() {
        cities = new ArrayList<>();

    }

    public static synchronized BookingService getInstance() {

        if(instance == null){
            instance = new BookingService();
        }

        return  instance;
    }

    public void addCity(City city){
        cities.add(city);
    }

    public List<Movie> searchMovies(String cityName){

        List<Movie> movies = new ArrayList<>();

        City city = cities.stream()
                .filter(c -> c.getName().equalsIgnoreCase(cityName))
                .findFirst()
                .orElse(null);

        if(city == null){
            return movies;
        }

        for(Theater theater : city.getTheaters()){
            for(Screen screen : theater.getScreens()){
                for(Show show : screen.getShows()){

                    movies.add(show.getMovie());
                }
            }
        }

        return movies.stream().distinct().toList();




    }

    public Booking bookTicket(Show show, List<Integer> seatIds){

        if(show.bookSeat(seatIds)){
            Booking booking = new Booking(bookingCounter++, show,seatIds);
            return booking;
        }

        return null;
    }

    //payment
    //concurrency
    //timeout
    //seat locking




}
