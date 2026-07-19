package entity;

import java.util.HashSet;
import java.util.Set;

public class Freelancer extends User {

    private final Set<Skill> skills;

    public Freelancer(String username, String password) {
        super(username, password, UserType.FREELANCER);
        this.skills = new HashSet<Skill>();
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public boolean addSkill(Skill skill) {
        return this.skills.add(skill);
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "skills=" + skills +
                "} " + super.toString();
    }
}
