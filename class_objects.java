import java.util.Scanner;
class Student
{
    int roll;
    String name;
    float percentage;
}
public class class_objects
{
    public static void main(String[] args) 
    {
    Student s1 = new Student();
    s1.roll = 04;
    s1.name = "Jack";
    s1.percentage = 92.0f;
    System.out.println("Student's Roll-Number is "+ s1.roll);
    System.out.println("Name of student is "+s1.name);
    System.out.println("His marks(%) is "+s1.percentage);
    Student s2 = new Student();
    s2.roll = 44;
    s2.name = "Sam";
    s2.percentage = 91.3f;
    System.out.println(s2.roll);
    System.out.println(s2.name);
    System.out.println(s2.percentage);
    }
}