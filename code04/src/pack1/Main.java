package pack1;

public class Main {

    public static void main1(String[] args) {
        Person p1 = new Person(1,"ali");
        Person p2 = new Person(2,"reza");
        Person p3 = new Person(3,"samaneh");

        p1.setFather(p2);
        p1.setMather(p3);

        System.out.println(p1);
    }

    public static void main(String[] args) {
        Geo geo = new Geo("Iran", "1");

        Geo geo2 = new Geo("Tehran", "2");
        Geo geo3 = new Geo("Mashhad", "3");

        geo.getChildren().add(geo2);
        geo.getChildren().add(geo3);

        System.out.println(geo);
    }
}
