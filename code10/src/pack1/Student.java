package pack1;

public class Student extends Person {

    private double grade;

    public Student(String name, double grade) {
        super(name);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void exam() {
        System.out.println("do exam ...");
    }
}
