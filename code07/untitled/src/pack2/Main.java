package pack2;

public class Main {

    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.setId(1);
        p1.setName("Programmer1");
        p1.setStack("Java");

        Programmer p2 = new Programmer(2, "Programmer2", "rezaee", 1000, "Java");
        p2.setId(2);
    }
}
