package pack1;

public class Person {

    String name;
    String family;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showPerson() {
        System.out.printf("Name : %s%n", name);
        System.out.printf("Family : %s%n", family);
        System.out.printf("Age : %d%n", age);
    }
}
