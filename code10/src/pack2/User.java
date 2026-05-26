package pack2;

public class User {

    private int id;
    private String username;

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
//        this
//        arg obj
        if (this == obj) return true;

        if (obj == null) return false;

//        if (!(obj instanceof User)) return false;
        if (this.getClass() != obj.getClass()) return false;

        User u2 = (User) obj;
        return (this.id == u2.id);
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, username='%s'}", id, username);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + username.hashCode();
        return result;
    }
}
