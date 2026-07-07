package entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Client extends User {

    private final Set<Project> projects;

    public Client(String username, String password) {
        super(username, password, UserType.CLIENT);
        projects = new LinkedHashSet<>();
    }

    public Set<Project> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return "Client{" +
                "projects=" + projects +
                "} " + super.toString();
    }
}
