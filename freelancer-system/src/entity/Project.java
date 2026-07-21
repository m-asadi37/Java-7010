package entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Project {

    private static long counter;
    private final long id;
    private String title;
    private String description;
    private ProjectStatus status;
    private double price;
    private Set<Skill> skills;
    private long hours;
    private Set<Offer> offers;

    public Project(String title, String description, double price, Set<Skill> skills, long hours) {
        this.id = ++counter;
        this.title = title;
        this.description = description;
        this.status = ProjectStatus.OPEN;
        this.price = price;
        this.skills = skills;
        this.hours = hours;
        this.offers = new LinkedHashSet<>();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public Set<Offer> getOffers() {
        return offers;
    }

    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Project project)) return false;

        return id == project.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", skills=" + skills +
                ", hours=" + hours +
                ", offers=" + offers +
                '}';
    }

    public boolean addOffer(Offer offer) {
        return this.offers.add(offer);
    }
}
