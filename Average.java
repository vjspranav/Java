import java.util.*;
public class Average 
{
    public static void main(final String[] args)
    {
        // Values already given to system
        int num1,num2,num3;
        float avg;
        num1=1000;
        num2=2000;
        num3=1500;
        avg= (num1 + num2 + num3)/3f;
        System.out.println("Average of 3 number is:-"+ avg);
        
        // User Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number :- ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number :- ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number :- ");
        int c = sc.nextInt();
        
        sc.close();

        avg= (a+b+c)/3f;
        System.out.println("Average is "+avg);
    }    
}