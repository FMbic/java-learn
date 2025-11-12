public class book
{
    private String bookTitle;
    private String author;
    private int isbn;
    private boolean isBorrowed;

    public book(String bookTitle, String author, int isbn, boolean isBorrowed)
    {
        this.author = author;
        this.bookTitle = bookTitle;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    public boolean borrowBook()
    {
        return isBorrowed;
    }

    public boolean returnBook()
    {
        if (isBorrowed)
        {
            isBorrowed = false;
        }
        return isBorrowed;
    }

    public  void getBookInfo()
    {
        System.out.println("Book Title: " + bookTitle+ " Author: " + author+ " borrowed status: " + isBorrowed);
    }
}

