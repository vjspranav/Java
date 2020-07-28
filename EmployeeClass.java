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
     EmployeeClass obj1 = new EmployeeClass(10245,"Chaitanya",18);  
     EmployeeClass obj2 = new EmployeeClass(92232,"Negan",10);  
     obj1.display();  
     obj2.display();  
     StringBuffer sb = new StringBuffer("abcdefghijk");
     sb.insert(3, "123");
     System.out.println(sb);
    }  
 }