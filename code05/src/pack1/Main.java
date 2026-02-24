package pack1;

public class Main {

    static {
        System.out.println("salam static block...");
    }

    public static void main(String[] args) {
        System.out.println("salam main method...");
        Person.test();
        System.out.println(Math.min(1, 7));

        Person.test();
        Person p1 = new Person();
        Person p2 = new Person();

        p1.test();

        System.out.println(p1.getId());
        System.out.println(p2.getId());

        p1.setCount(11);
        System.out.println(p2.getCount());
    }
}
