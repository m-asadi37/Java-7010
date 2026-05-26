package pack1;

public class Person extends Object{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name : " + this.name);
    }
}
