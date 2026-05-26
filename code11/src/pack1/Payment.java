package pack1;

import java.time.LocalDateTime;

public class Payment {

    private static int count;
    private int id;
    private double amount;
    private PaymentStatus status;
    private LocalDateTime time;

    public Payment(double amount, PaymentStatus status) {
        this.id = ++count;
        this.amount = amount;
        this.status = status;
    }

    public Payment(double amount) {
        this.id = ++count;
        this.status = PaymentStatus.PENDING;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void done(){
        this.status = PaymentStatus.DONE;
        this.time = LocalDateTime.now();
    }

    public void cancel(){
        this.status = PaymentStatus.CANCELLED;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Payment{id=%d, amount=%s, status='%s', time=%s}"
                .formatted(id, amount, status, time);
    }
}
