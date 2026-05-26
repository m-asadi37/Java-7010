package pack2;

//Programmer IS-A Employee
public class Programmer extends Employee {

    private String stack;

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Programmer() {
        System.out.println("Programmer Constructor 1...");
    }

    public Programmer(int id, String name, String family, double salary, String stack) {
        super(id, name, family, salary);
        System.out.println("Programmer Constructor 2...");
        this.stack = stack;
    }
}