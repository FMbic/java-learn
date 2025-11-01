import java.util.Scanner;


/*
Create a program that generates a multiplication table for any number.

Requirements:
Use a for loop
Ask user for a number
Print its multiplication table from 1 to 10
Format: "5 x 3 = 15"
 */
public class for2
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number\n");
        Scanner usInp = new Scanner(System.in);
        int number = usInp.nextInt();


        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));

        }


    }
}
