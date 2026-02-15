package pack1;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("ahmad", 10);
        Person p2 = new Person("bahar", 17);

        Job j1 = new Job("Programmer", 700);
        Job j2 = new Job("Manager", 1000);

        p1.setJob(j1);
        p2.setJob(j2);

        Job j3 = new Job("Driver", 500);
        Person p3 = new Person("ali", 30, j3);
    }
}
