public class facilityMember extends libraryMember
{
    public void checkBooks()
    {
        if (borrowedBooks > 10)
        {
            System.out.println("Your limit is reached, you borrowed "+ borrowedBooks+" books");
        }
    }
}
