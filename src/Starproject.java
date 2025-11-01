import java.util.Scanner;

public class Starproject
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to see: ");
        int rows = scan.nextInt();

        for (int i = 0; i <= rows; i++)
        {

            for  (int j = 0; j <= i ; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
