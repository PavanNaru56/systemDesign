package TicketBookingSystem;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {

    private int bookingId;

    private Show show;

    private List<Integer> seatIds;

    private LocalDateTime bookingTime;

    public Booking(int bookingId, Show show, List<Integer> seatIds) {
        this.bookingId = bookingId;
        this.show = show;
        this.seatIds = seatIds;
        this.bookingTime = LocalDateTime.now() ;
    }
}
