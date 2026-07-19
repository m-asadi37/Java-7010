package service;

import entity.Client;
import entity.Freelancer;
import entity.User;
import entity.UserType;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserService {

    private final Set<User> USERS = new LinkedHashSet<>();

    public User login(String user, String pass) {
        for (User ind : USERS) {
            if (ind.getUsername().equals(user) && ind.getPassword().equals(pass)) {
                return ind;
            }
        }
        return null;
    }

    public User register(String username, String password, UserType type) {
        for (User ind : USERS) {
            if (ind.getUsername().equals(username))
                return null;
        }
        User created;
        if (type == UserType.CLIENT) {
            created = new Client(username, password);
        } else {
            created = new Freelancer(username, password);
        }
        USERS.add(created);
        return created;
    }

    public void addBalance(User user, double amount) {
        user.addBalance(amount);
    }
}
