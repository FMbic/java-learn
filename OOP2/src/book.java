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
            System.out.println("Book has been borrowed by"+ isbn+ " "+ bookTitle+ " "+ author );

        } else {
            if (castIsBorrowed == 0)
            {
                castIsBorrowed =1;

            }
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

