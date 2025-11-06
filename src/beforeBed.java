import java.util.Random;

public class beforeBed
{
    public static void main(String[]args)
    {

        /*
        Create a program that:

        Stores 3 of your favorite numbers in an array
        Prints each number with a message
        Calculates and prints the sum
         */

        int [] favoritNumbers = new int[3];
        int sum = 0;

            for (int i = 0; i < favoritNumbers.length; i++)
            {
                sum = sum + favoritNumbers[i];
                System.out.println("Number " +favoritNumbers[i]+ " the total " + sum);

            }


    }
}
