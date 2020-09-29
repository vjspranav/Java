class Employee
{
    int empId;  
    String empName; 
    int empExperience; 
         
    void insert(int id, String name, int experience)
    {  
        this.empId = id;  
        this.empName = name;
        this.empExperience = experience;  
    }  
    void display()
    {
         System.out.println("Id:- "+empId+" ; Name:- "+empName+" ; Experience in years:- "+empExperience);
    }  
}
public class EmployeeInsert
{
    public static void main(String args[])
    {  
     Employee obj1 = new Employee();  
     Employee obj2 = new Employee();  
     obj1.insert(10245,"Chaitanya",18);
     obj2.insert(10234,"Sid",3);
     obj1.display();  
     obj2.display();  
    }  
}