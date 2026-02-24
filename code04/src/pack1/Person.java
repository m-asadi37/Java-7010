package pack1;

public class Person {

    public Person(int code, String name) {
        this.code = code;
        this.name = name;
    }

    private int code;
    private String name;
    private Person father;
    private Person mather;

    public Person getMather() {
        return mather;
    }

    public void setMather(Person mather) {
        this.mather = mather;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", father=" + father +
                ", mather=" + mather +
                '}';
    }
}
