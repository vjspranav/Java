import java.util.Scanner;

class Stud 
{
    private String rollnum;
    private String name;
    private double gcpa;

    Scanner KB = new Scanner(System.in);

    //method to open an record
    void openRecord() 
    {
        System.out.print("Enter Your Roll-Number: ");
        rollnum = KB.next();
        System.out.print("Enter your Name: ");
        name = KB.next();
        System.out.print("Enter your last semesters gcpa: ");
        gcpa = KB.nextDouble();
    }

    //method to display record details
    void showRecord() 
    {
        System.out.println(rollnum + "," + name + "," + gcpa);
    }

}

public class StudentArray 
{
    public static void main(String arg[]) 
    {
        Scanner KB = new Scanner(System.in);

        //create initial records
        System.out.print("How Many Record you want to Input : ");
        int n = KB.nextInt();
        Stud C[] = new Stud[n];
        for (int i = 0; i < C.length; i++) 
        {
            C[i] = new Stud();
            C[i].openRecord();
        }

        //run loop until menu 2 is not pressed
        int ch;
        do {
            System.out.println("Main Menu\n1. Display All\n2.Exit ");
                System.out.println("Ur Choice :"); ch = KB.nextInt();
                switch (ch) 
                {
                    case 1:
                        for (int i = 0; i < C.length; i++) 
                        {
                            C[i].showRecord();
                        }
                        break;

                    case 2:
                        System.out.println("Good Bye..");
                        break;
                }
            }
            while (ch != 2);
        }
    }