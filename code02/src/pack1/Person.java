package pack1;

public class Person {

    private String name;
    private int age;
    private Job job;
    //composition
    //has-a : each pack1.Person has a job

    public Person(String name, int age, String jobName, double jobSalary) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
