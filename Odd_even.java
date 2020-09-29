import java.util.Scanner;
public class Odd_even 
{
    public static void main(final String[] args)
    {   
        // User Input
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int a = num1.nextInt();
        if (a % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        num1.close();
    }    
}