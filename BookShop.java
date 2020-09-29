class Publication {
    // Title of the publication.
    private String title;
    // Price of the publication.
    private double price;

    public String getTitle() 
    {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } 
        else 
        {
            System.out.println("Invalid price");
        }
    }

    public double getPrice() 
    {
        return this.price;
    }

    public void sell(int qty) {
        System.out.println("Total: Rs." + (qty * price));
    }

    public void display()
    {
        System.out.println("Price is: Rs."+price);
    }
}

class Magazine extends Publication 
{
    // Author of the magazine.
    String issue;

    public String getIssue() 
    {
        return this.issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}

class Book extends Publication 
{
    // Author of the book.
    String author;

    public String getAuthor() 
    {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class BookShop {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Hamlet");
        book.setAuthor("William Shakespeare");
        book.setPrice(500);
        System.out.println("Title of the book is:- "+book.getTitle());
        System.out.println("Author of the book is:- " +book.getAuthor());
        book.display();
    
        Magazine magazine = new Magazine();
        magazine.setTitle("TIME");
        magazine.setIssue("Feb. 2, 2015");
        magazine.setPrice(60);
        System.out.println("Title of the magazine is:- "+magazine.getTitle());
        System.out.println("Magazine issue is:- " +magazine.getIssue());
        magazine.display();

        book.sell(20);
        magazine.sell(13);
    }
}