public class facilityMember extends libraryMember {
    public void checkBooks() {
        if (borrowedBooks > 10) {
            System.out.println("Your limit is reached, you borrowed " + borrowedBooks + " books");
        }
    }

    public void calculateFine(int daysOverdue) {
        double fineAmount = 0;

        if (daysOverdue > 14) {
            fineAmount = (daysOverdue - 14) * 0.5;
        }
    }
}