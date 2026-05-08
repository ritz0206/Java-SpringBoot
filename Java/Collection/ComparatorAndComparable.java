import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    String name;
    int age;

    public String toString()
    {
        return name + " " + age;
    }

    @Override
    public int compareTo(Student stud) {
        return Integer.compare(this.age, stud.age);
    }
}

public class ComparatorAndComparable {
    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(17);
        nums.add(39);
        nums.add(21);

        System.out.println(nums); //[43, 17, 39, 21]

        //Sort this values

        /*Comparator<Integer> cmp = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
                return Integer.compare(a % 10, b % 10);
            }


        };*/
        //Lambda expression for above comparator
        Comparator<Integer> cmp = (Integer a, Integer b) -> {
            return Integer.compare(a % 10, b % 10);
        };
        Collections.sort(nums, cmp);
        System.out.println(nums); //[21, 43, 17, 39]

        //comparable example

        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 22;
        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 20;
        Student s3 = new Student();
        s3.name = "Charlie";
        s3.age = 21;
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students); //[Alice 22, Bob 20, Charlie 21]
        Collections.sort(students);
        System.out.println(students); //[Bob 20, Charlie 21, Alice 22]
    }
}
