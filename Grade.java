import java.util.Scanner;
public class Grade 
{
    public static void main(final String[] args)
    {   
        // User Input
        Scanner per = new Scanner(System.in);
        System.out.print("Enter your Percentage (Please round it up xD):- ");
        float a = per.nextInt();
        if (a >= 80f)
        {
            System.out.println("First Class with Distinction");
        }
        else if (a >= 70f && a <= 80f)
        {
            System.out.println("First class");
        }
        else if (a >= 35f && a <= 70f)
        {
            System.out.println("Second class");
        }
        else if (a <= 34f)
        {
            System.out.println("Fail");
        }
        per.close();
    }    
}