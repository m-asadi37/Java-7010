package service;

import entity.User;

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
}
