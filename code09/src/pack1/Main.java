package pack1;

import java.util.*;

public class Main {

    public static void main1(String[] args) {
        Student.printStudent2();

        Student s1 = new Student("ali");
        s1.setGrade(20);

        s1.printStudent();
    }

    public static void main(String[] args) {
        Student s1 = new Student("aaa");
        s1.setGrade(20);

        Person p1 = new Person("aaa");

        Person p2 = new Student("bbb");
        p2.printName();
//        p2.printStudent();
        ((Student) p2).printStudent();

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
    }
}
