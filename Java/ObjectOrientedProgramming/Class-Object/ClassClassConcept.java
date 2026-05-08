class Student
{
    String name;
    static int age;
    String grade;

    static
    {
        age = 14;
    }
    public Student(String name, int age, String grade)
    {
        this.name = name;
        this.grade = grade;
    }
}

public class ClassClassConcept {
    public static void main(String a[])
    {
        //Class class to load the Student class into memory
        try {
            Class.forName("Student");
            System.out.println("Class loaded successfully: " + Student.class.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
