import java.util.Scanner;
public class EmployeeClass
{
    int empId;  
    String empName; 
    int empExperience; 
         
    EmployeeClass(int id, String name, int experience)
    {  
        this.empId = id;  
        this.empName = name;
        this.empExperience = experience;  
    }  
    void display()
    {
         System.out.println("Id:- "+empId+" ; Name:- "+empName+" ; Experience in years:- "+empExperience);
    }  
        
    public static void main(String args[])
    {  
     Scanner emp = new Scanner(System.in);
     System.out.println("Enter Employee Id, Name and Experience");
     int a = emp.nextInt();
     String nam = emp.next();
     int c = emp.nextInt();
     EmployeeClass obj1 = new EmployeeClass(a,nam,c);  
     EmployeeClass obj2 = new EmployeeClass(92232,"Negan",10);  
     obj1.display();  
     obj2.display();  
    }  
 }