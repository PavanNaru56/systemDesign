package TicketBookingSystem;

import java.time.LocalDateTime;
import java.util.List;

public class Show {

    private int showId;

    private Movie movie;

    private LocalDateTime date;

    private List<Seat> seatList;

    public Show(int showId, Movie movie, LocalDateTime date, List<Seat> seatList) {
        this.showId = showId;
        this.movie = movie;
        this.date = date;
        this.seatList = seatList;
    }

    public List<Seat> getAvailableSeats(){

        return seatList.stream()
                .filter(Seat::isAvailable)
                .toList();
    }

    public boolean bookSeat(List<Integer> seatIds){

        for(Integer seatId : seatIds){

            Seat seat = seatList.stream()
                    .filter(s -> s.getSeatID() == seatId)
                    .findFirst()
                    .orElse(null);

            if(seat == null || !seat.isAvailable()){
                return false;
            }

        }

        for(Integer seatId : seatIds){

            seatList.stream()
                    .filter(s -> s.getSeatID() == seatId)
                    .findFirst()
                    .get()
                    .book();
        }

        return true;
    }

    public Movie getMovie() {
        return this.movie;
    }


}
