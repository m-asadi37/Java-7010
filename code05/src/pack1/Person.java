package pack1;

public class Person {

    private static int count;
    private int id;

    static {
        count = 100;
    }

    public Person() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        Person.count = count;
    }

    public static void test() {
        //this : نشان دهنده شیی که دارد متد را صدا میزند
        System.out.println("test");
        System.out.println("count: " + Person.count);
//        System.out.println("id: " + this.id);
    }
}
