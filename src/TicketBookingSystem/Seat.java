package TicketBookingSystem;

public class Seat {

    private int seatID;
    private SeatType seatType;
    private SeatStatus seatStatus;

    public Seat(int seatID, SeatType seatType) {
        this.seatID = seatID;
        this.seatType = seatType;
        this.seatStatus = SeatStatus.AVALIABLE;
    }

    public boolean isAvailable() {
        return this.seatStatus == SeatStatus.AVALIABLE;
    }

    public void book(){
        this.seatStatus = SeatStatus.BOOKED;
    }

    public int getSeatID() {
        return this.seatID;
    }








}
