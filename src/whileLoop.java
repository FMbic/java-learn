import java.util.Scanner;
import java.util.random.RandomGenerator;

public class whileLoop
{
    public static void main(String[] args)
    {
        System.out.print("Guess a number between 1 and 10: \n");
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        int size = 10;

        int needsToGuess = (int) (Math.random() * size +1);
        /// System.out.println("random number is " + needsToGuess);

        while (num != needsToGuess)
        {
            System.out.print("Guess again: \n");

            num = userInput.nextInt();

            if (num == needsToGuess){
                System.out.print("You guessed correctly.");
            }
        }


    }
}
