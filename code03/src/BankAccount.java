public class BankAccount {

    private int id;
    private String card;
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(int id, String card) {
        this.id = id;
        this.card = card;
        this.balance = 0.0;
    }

    public BankAccount(int id, String card, double balance) {
        this.id = id;
        this.card = card;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", card='" + card + '\'' +
                ", balance=" + balance +
                '}';
    }
}
