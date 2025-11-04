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

        int loopCount = 1;
        int [] attendance = new int[5];

        while (loopCount < 6) {
            for (int i = 0; i < 5; i++)
            {
                attendance[i] = (int) Math.round(randNum * Math.random());
            }
            System.out.println("Array # " + loopCount);
            for (int i = 0; i< attendance.length; i++)
            {
                System.out.println(attendance[i]);
            }
            loopCount++;
        }

    }
}
