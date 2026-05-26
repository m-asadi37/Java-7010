package pack1;

public class Main {

    public static void main1(String[] args) {
        Student s1 = new Student("razieh", 20);
        s1.exam();
        s1.printName();

        Person p1 = new Person("marzieh");
        p1.printName();

        Person p2 = new Student("saeed", 19.75);
        p2.printName();

        Student s2 = (Student) p2;
        s2.exam();
        s2.printName();
    }

    public static void main(String[] args) {
        Test test = new Test();

    }
}
