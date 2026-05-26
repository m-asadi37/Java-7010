package pack3;

import java.time.LocalDateTime;

public class Payment {

    private static int count;
    private int id;
    private final LocalDateTime time;
    private double amount;

    public Payment(double amount) {
        this.id = ++count;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Paying{" +
                "id=" + id +
                ", time=" + time +
                ", amount=" + amount +
                '}';
    }
}
