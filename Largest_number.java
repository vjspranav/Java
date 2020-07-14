import java.util.Scanner;
public class Largest_number 
{
    public static void main(final String[] args)
    {   
        // User Input
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1st number :- ");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 2nd number :- ");
        int b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter 3rd number :- ");
        int c = sc3.nextInt();
        // Above block is same as the average calc. code
        if (a > b && b > c)
        {
            System.out.println("Greatest number is "+a);
        }
        else if (a < b && b > c) 
        {
            System.out.println("Greatest number is "+b);
        }
        else
        {
            System.out.println("Greatest number is "+c);
        }
    }        
}