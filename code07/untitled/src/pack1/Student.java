package pack1;

public class Student extends Person {

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void showStudent() {
        System.out.println("name: " + name);
        System.out.println("family: " + family);
        System.out.println("age: " + age);
        System.out.println("grade: " + grade);
    }
}
