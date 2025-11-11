public class book
{
    private String bookTitle;
    private String author;
    private int isbn;
    private boolean isBorrowed;

    public void borrowBook()
    {
        isBorrowed = false;

    }

    public void returnBook()
    {

    }

    public  void getBookInfo()
    {
        System.out.println("Book Title: " + bookTitle+ " Author: " + author+ " borrowed status: " + isBorrowed);
    }
}

