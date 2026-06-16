package hw2;

public class Driver extends User {

    private long rides;
    private double pointAvg;
    private double balance;

    public Driver(String name, String family, String phone, double balance) {
        super(name, family, phone, UserType.DRIVER);
        this.rides = 0;
        this.pointAvg = 0;
        this.balance = balance;
    }

    public long getRides() {
        return rides;
    }

    public void setRides(long rides) {
        this.rides = rides;
    }

    public double getPointAvg() {
        return pointAvg;
    }

    public void setPointAvg(double pointAvg) {
        this.pointAvg = pointAvg;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "rides=" + rides +
                ", pointAvg=" + pointAvg +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void doRide(Ride ride) {
        super.doRide(ride);
        this.pointAvg = ((rides * pointAvg) + ride.getPoint()) / (rides + 1);
        this.rides++;
        this.balance += ride.getPrice();
    }
}
