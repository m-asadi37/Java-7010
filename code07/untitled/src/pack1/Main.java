package pack1;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("John");
        p1.setFamily("Road");
        p1.setAge(30);
        p1.showPerson();

        Student s1 = new Student();
        s1.setName("bahar");
        s1.setFamily("bahari");
        s1.setAge(30);
        s1.setGrade(19.5);
        s1.showStudent();


        Teacher t1 = new Teacher();
        t1.setName("ali");
        t1.setFamily("aliani");
        t1.setAge(40);
        t1.showPerson();
    }
}
