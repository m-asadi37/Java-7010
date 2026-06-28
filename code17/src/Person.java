public class Person {

    private static int count;
    int id;
    String name;

    public Person(String name) {
        this.id = ++count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;

        return this.name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
