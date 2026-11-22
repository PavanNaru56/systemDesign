package TicketBookingSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String [] args){

        List<Seat> seats = new ArrayList<>();

        for(int i = 1; i < 10; i++){

            seats.add(new Seat(i,SeatType.REGULAR));
        }

        //movie
        Movie movie = new Movie(1,"KGF", 150, "action");

        Show show = new Show(1,movie, LocalDateTime.now().plusHours(1),seats);

        //screen

        Screen screen = new Screen(1);
        screen.addShow(show);

        //Theater

        Theater theater = new Theater("PVR");
        theater.addScreen(screen);

        //City
        City city = new City("Nagpur");
        city.addTheater(theater);

        //booking service
        BookingService bookingService = BookingService.getInstance();
        bookingService.addCity(city);

        //search movies in Nagpur

        System.out.println("Movies running in Nagpur");

        List <Movie> movies = bookingService.searchMovies("Nagpur");

        for(Movie m : movies){
            System.out.println("---" + m.getMovieName() + "----");

        }


        //seats

        System.out.println("Available Seats before booking");
        show.getAvailableSeats().forEach(s -> System.out.println(s.getSeatID() + " "));
        System.out.println();

        //bboking
        List<Integer> seatToBook = Arrays.asList(2,3,4);

        Booking booking = bookingService.bookTicket(show,seatToBook);

        if(booking != null){
            System.out.println("Booking Successful Bookingid = " + booking);
            System.out.println("Booked seats : " + seatToBook);
        }
        else
        {
            System.out.println("Booking Failed. ");
        }

















    }
}
