import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight {

    public Flight(String number, String airline, String dest, LocalDateTime time, String status) {
        this.number = number;
        this.airline = airline;
        this.dest = dest;
        this.time = time;
        this.status = status;
    }

    public Flight(String number, String airline, String dest, LocalDateTime time) {
        this.number = number;
        this.airline = airline;
        this.dest = dest;
        this.time = time;
        this.status = "ON-TIME";
    }

    private String number;
    private String airline;
    private String dest;
    private LocalDateTime time;
    private String status;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void info() {
        System.out.printf("%s\t%s\t%s\t%s\t%s\n",
                number, airline, dest, DateTimeFormatter.ISO_DATE_TIME.format(time), status);
    }
}
