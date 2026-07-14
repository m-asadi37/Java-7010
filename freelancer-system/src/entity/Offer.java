package entity;

public class Offer {

    private static long counter;
    private final long id;
    private Freelancer freelancer;
    private Project project;
    private boolean isSelected;
    private long hours;
    private double price;

    public Offer(Freelancer freelancer, Project project, long hours, double price) {
        this.id = ++counter;
        this.freelancer = freelancer;
        this.project = project;
        this.isSelected = false;
        this.hours = hours;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Offer offer)) return false;

        return id == offer.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", freelancer=" + freelancer +
                ", project=" + project +
                ", isSelected=" + isSelected +
                ", hours=" + hours +
                ", price=" + price +
                '}';
    }
}
