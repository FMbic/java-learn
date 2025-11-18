import java.util.Scanner;

public class simpleCalculator
{
    Scanner sc = new Scanner(System.in);


    public int devide()
    {
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();

        System.out.print("Result of the devision ");
        int devision = 0;

        try
        {
            devision = num1 / num2;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("\nYou can't divide "+ ae.getMessage());

        }

        return devision;
    }

public static void  main(String[] args)
{
    simpleCalculator smc = new simpleCalculator();

    System.out.println(smc.devide());
}
}
