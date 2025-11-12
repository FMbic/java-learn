public class studentMember extends libraryMember
{
    public void checkBooks()
    {
        if (borrowedBooks > 3)
        {
            System.out.println("Your limit is reached, you borrowed "+ borrowedBooks+" books");
        }
    }

}