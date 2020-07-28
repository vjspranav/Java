class Techie
{
    int id;
    String name;
    int experience; // In years
}
public class method 
{
public static void main(String[] args) 
    {
        // Techie 1
        Techie s1 = new Techie();
        s1.id = 04;
        s1.name = "Jack";
        s1.experience = 10;
        System.out.println("Techie's id-Number is:- "+ s1.id);
        System.out.println("Name of the Techie is:- "+s1.name);
        System.out.println("He has "+s1.experience+" years of experience");
        
        System.out.println("-------------------------------");
        
        // Techie 2
        Techie s2 = new Techie();
        s2.id = 44;
        s2.name = "Sam";
        s2.experience = 13;
        System.out.println("Techie's id-Number is "+ s2.id);
        System.out.println("Name of the Techie is "+ s2.name);
        System.out.println("He has "+s2.experience+" years of experience");
    }        
}