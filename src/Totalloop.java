import java.util.Scanner;

public class Totalloop
{
    public static void main (String [] args)
    {
        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Enter number "+ i + " : ");
            int numbers = total + scan.nextInt();
            total = numbers + total;

        }

        System.out.println("The total is "+ total);
    }
}
