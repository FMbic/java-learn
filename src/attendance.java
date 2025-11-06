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

        int loopIterations = 1;
        int [] attendance = new int[5];
        int [] totalDaysPresent = new int [attendance.length];
        int [] streak = new int [attendance.length];
        int [] maxStreak = new int[attendance.length];


        String [] students = {"Krew Terrell", "Avah Humphrey", "Marley Wilkins", "Murphy Galindo", "Michael Brown"};

        while (loopIterations < 6) {
            double randNum = Math.random();

            /// nested loop for generating a random number then adding it to an array
            for (int i = 0; i < 5; i++)
            {
                attendance[i] = (int) Math.round(randNum * Math.random());
            }

            ///  nested loop for going through 2 arrays and printing out the result(random number and a student name)
            for (int j = 0; j< attendance.length; j++)
            {
                /// getting the numbers of days that the student was present
                if (attendance[j] == 1)
                {
                    totalDaysPresent[j] = totalDaysPresent[j] + 1;
                } else
                {
                    totalDaysPresent[j] += 0;
                }

                if (attendance[j] != 0)
                {
                    streak[j]++;
                    if (streak[j] == 1)
                    {
                        maxStreak[j]++;
                    }
                }
                else
                {
                    streak[j] = 0;
                }
            }


            loopIterations++;

        }

        for (int k = 0; k < totalDaysPresent.length;k++)
        {
            System.out.println("Student name " + students[k]+ " total present days "+totalDaysPresent[k]+
                    " percentage of days present "+(int)((double)totalDaysPresent[k]/attendance.length*100) +" % "
                    +" Longest streak "+maxStreak[k]);
        }


    }
}
