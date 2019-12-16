
package main;
public class Showtime {
      private int Time;
    private String ticket;
    private String movie;

    public Showtime(int Time, String ticket, String movie) {
        this.Time = Time;
        this.ticket = ticket;
        this.movie = movie;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    
    public String toString() {
        return "Showtime{" + "Time=" + Time + ", ticket=" + ticket + ", movie=" + movie + '}';
    }

}
