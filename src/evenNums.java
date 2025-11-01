import java.util.Scanner;

public class evenNums
{

    public static void main(String[] args ) {


        Scanner scan = new Scanner(System.in);
        int totalEvenNums = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your number " + i + ": ");
            int enteredNum = scan.nextInt();
            if (enteredNum % 2 == 0) {
                totalEvenNums++;
            }

        }
        System.out.println("Total even numbers: "+totalEvenNums);
    }
}
