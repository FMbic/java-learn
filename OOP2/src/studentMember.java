public class studentMember extends libraryMember
{
    public void checkBooks()
    {
        if (borrowedBooks > 3)
        {
            System.out.println("Your limit is reached, you borrowed "+ borrowedBooks+" books");
        }
    }


    public void calculateFine(int daysOverdue)
    {
        int fineAmount = 0;

        if (daysOverdue > 7)
        {
            fineAmount = (daysOverdue-7)*1;
        }

    }
}

