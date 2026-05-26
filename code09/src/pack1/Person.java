package pack1;

public class Person {

    protected String name;

    public Person(String name) {
        System.out.println("Person constructor 1");
        this.name = name;
    }

    public void printName() {
        System.out.println("name : " + name);
    }
}
