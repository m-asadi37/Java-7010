package pack2;

public class Employee {

    private int id;
    private String name;
    private String family;
    private double salary;

    public Employee(int id, String name, String family, double salary) {
        System.out.println("Employee constructor 2...");
        this.id = id;
        this.name = name;
        this.family = family;
        this.salary = salary;
    }

    public Employee() {
        System.out.println("Employee constructor 1...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
