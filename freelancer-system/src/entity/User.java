package entity;

public class User {

    private static long counter;
    private final long id;
    private String username;
    private String password;
    private UserType type;
    private double balance;

    public User(String username, String password, UserType type) {
        this.id = ++counter;
        this.username = username;
        this.password = password;
        this.type = type;
        this.balance = 0.0;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof User)) return false;

        return id == ((User) o).id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }
}
