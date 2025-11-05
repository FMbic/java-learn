import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;


public class attendance
{
    public static void main (String[] args)
    {
        /*
        Create a program that:
Stores attendance for 5 days (1 = present, 0 = absent)
Calculates total days present
Calculates attendance percentage
Finds the longest streak of present days
         */

        double randNum = Math.random();

        int loopIterations = 1;
        int [] attendance = new int[5];

        String [] students = {"Krew Terrell", "Avah Humphrey", "Marley Wilkins", "Murphy Galindo", "Michael Brown"};

        while (loopIterations < 6) {
            for (int i = 0; i < 5; i++)
            {
                ///  Fix so the numbers would be randomized in a loop each time you run it
                attendance[i] = (int) Math.round(randNum * Math.random());
            }
            System.out.println("Day " + loopIterations + " attendance");
            for (int i = 0; i< attendance.length; i++)
            {
                System.out.println(attendance[i] + " " + students[i]);
            }
            loopIterations++;

            ///  do the if else statments to do the rest that way you won't need to store the data
            ///  you will see the results quicker
        }

    }
}
