public class book
{
    private String bookTitle;
    private String author;
    private int isbn;
    private boolean isBorrowed;
    private int castIsBorrowed = isBorrowed ? 1:0;

    public void borrowBook()
    {

        if (castIsBorrowed == 1)
        {
            isBorrowed = true;
        }
        else
        {
            isBorrowed = false;
        }


    }

    public void returnBook()
    {

    }

    public  void getBookInfo()
    {
        System.out.println("Book Title: " + bookTitle+ " Author: " + author+ " borrowed status: " + isBorrowed);
    }
}

