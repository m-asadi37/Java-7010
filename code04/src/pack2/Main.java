package pack2;


public class Main {

    public static void main(String[] args) {

        Person.count = 4;

        Person p1 = new Person("p1");
        Person p2 = new Person("p2");
        Person p3 = new Person("p3");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("*****");

        p3.setId(4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
