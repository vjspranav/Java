import java.util.Scanner;

class Add
{
    int first;
    int second;
}
class Subs
{
    int first;
    int second;
}
class Multiply
{
    int first;
    int second;
}
class Divide
{
    int first;
    int second;
}

public class Calc 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                Add s1 = new Add();
                System.out.println("Enter 2 numbers:- ");
                s1.first = sc.nextInt();
                s1.second = sc.nextInt();
                result = s1.first + s1.second;
                System.out.printf("Sum of the 2 numbers is:-\n"+result);
                break;
            
            case '-':
                Subs s2 = new Subs();
                System.out.println("Enter 2 numbers:- ");
                s2.first = sc.nextInt();
                s2.second = sc.nextInt();
                result = s2.first - s2.second;
                System.out.printf("Subtraction of the 2 numbers is:-\n"+result);
                break;

            case '*':
                Multiply s3 = new Multiply();
                System.out.println("Enter 2 numbers:- ");
                s3.first = sc.nextInt();
                s3.second = sc.nextInt();
                result = s3.first * s3.second;
                System.out.printf("Multiplication of the 2 numbers is:-\n"+result);
                break;

            case '/':
                Divide s4 = new Divide();
                System.out.println("Enter 2 numbers:- ");
                s4.first = sc.nextInt();
                s4.second = sc.nextInt();
                result = s4.first / s4.second;
                System.out.printf("Division of the 2 numbers is:-\t"+result);
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct\n");
                reader.close();
                sc.close();
                return;
        }
        reader.close();
        sc.close();
    }
}