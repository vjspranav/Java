import java.util.Scanner;
class Publication
{
    int price;  
    String title; 
    int copies;
    int bookid;
 
    void Publication(int price, String title, int copies)
    {   
        Scanner emp = new Scanner(System.in);
        System.out.print("Enter the Price of the book: ");
        price = emp.nextInt();
        System.out.print("Enter the Title of the book:  ");
        title = emp.next();
        System.out.print("Enter the number of copies you want to add in inventory: ");
        copies = emp.nextInt();
        System.out.print("Enter the id of the book: ");
        bookid = emp.nextInt();
    }  
    void display()
    {
        System.out.println("Title of book: "+title);
        System.out.println("Price is: "+price);
        System.out.println("No of copies: "+copies);
        System.out.println("The id of the book is: "+bookid);
    }  
}        
public class BookStore {
    public static void main(String args[])
    {  
        Scanner KB = new Scanner(System.in);

        //create initial accounts
        System.out.print("How Many books you want to add to inventory: ");
        int n = KB.nextInt();
        Publication C[] = new Publication[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Publication();
            C[i].Publication();
        }
        for (int i = 0; i < C.length; i++) {
            C[i].display();
        }    
    }  
} 