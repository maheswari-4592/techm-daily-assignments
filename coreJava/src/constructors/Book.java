package constructors;

public class Book 
{
    private String title;
    private String author;
    private String isbn;

    // Parameterized constructor
    public Book(String title, String author, String isbn) 
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public String getIsbn() 
    {
        return isbn;
    }

    public static void main(String[] args) 
    {
        Book book = new Book("Java", "smith", "5943-548955950808");
        
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book ISBN: " + book.getIsbn());
    }
}
