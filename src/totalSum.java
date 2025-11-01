import java.util.Scanner;

public class totalSum
{
    public static void  main(String [] args)
    {
        /// Create a program that asks the user for 5 numbers and calculates their total sum.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter a number 2 : ");
        int num2 = scan.nextInt();
        System.out.println("Enter a number 3 : ");
        int num3 = scan.nextInt();
        System.out.println("Enter a number 4 : ");
        int num4 = scan.nextInt();
        System.out.println("Enter a number 5 : ");
        int num5 = scan.nextInt();

        for (int i = 1;;) {
            int totalRes = num1 * num2 * num3 * num4 * num5;
            System.out.println("Total sum is " + totalRes);
            break;
        }
    }
}
