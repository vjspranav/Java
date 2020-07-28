import java.util.Scanner;
public class Largest_number 
{
    public static void main(final String[] args)
    {   
        // User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number :- ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number :- ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number :- ");
        int c = sc.nextInt();
        
        sc.close();

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