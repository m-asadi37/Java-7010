package pack1;

public class Student extends Person {

    private double grade;

    public Student(String name) {
        super(name);
        System.out.println("Student constructor 1");
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void printStudent() {
        System.out.println("name : " + super.name);
        super.printName();
        System.out.println("grade : " + this.grade);
    }

    public static void printStudent2() {
//        System.out.println("name : " + super.name);
//        System.out.println("grade : " + this.grade);
    }
}
