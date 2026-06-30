public class Student implements Comparable<Student> {

    private static int count;

    int id;
    String name;
    double grade;

    public Student(String name, double grade) {
        this.id = ++count;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    //this              3 10
    //Student o (arg)   1 13
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
