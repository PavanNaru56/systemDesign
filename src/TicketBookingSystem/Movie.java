package TicketBookingSystem;

public class Movie {
    private int movieID;
    private String movieName;
    private  int duration;
    private String genre;

    public Movie(int movieID, String movieName, int duration, String genre) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.duration = duration;
        this.genre = genre;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
