class Publication {
    // Title of the publication.
    private String title;
    // Price of the publication.
    private double price;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void sell(int qty) {
        System.out.println("Total: Rs." + (qty * price));
    }
}

class Magazine extends Publication {
    // Author of the magazine.
    private String issue;

    public String getIssue() {
        return this.issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}

class Book extends Publication {
    // Author of the book.
    private String author;

    public String getAuthor() {
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
        book.setPrice(5.95);

        Magazine magazine = new Magazine();
        magazine.setTitle("TIME");
        magazine.setIssue("Feb. 2, 2015");
        magazine.setPrice(0.58);

        book.sell(0);
        magazine.sell(1);
    }
}