package constructors;

public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student stu = new Student();
        
        System.out.println("Student Name: "+ stu.getName());
        System.out.println("Student Age: " + stu.getAge());
    }
}
