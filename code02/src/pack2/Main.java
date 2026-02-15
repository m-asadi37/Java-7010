package pack2;

public class Main {

    public static void main(String[] args) {
        Engine e1 = new Engine(110, "K4");

        Car c1 = new Car(5, 100, e1);

        c1.move();
        System.out.println(c1);
    }
}
