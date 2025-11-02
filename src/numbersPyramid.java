import java.util.Scanner;

public class numbersPyramid
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of row in a pyramid: ");
        int numRow = scan.nextInt();

        for (int i =1; i <= numRow; i++)
        {
            for  (int j = 1; j <= i + 1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
