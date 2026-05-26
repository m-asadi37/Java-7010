package pack1;

public class Animal {

    /*default - package protected*/
    String name;
    protected int age;

    public void speak() {
        System.out.println("I'm an Animal..!");
    }

    protected void showInfo(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
