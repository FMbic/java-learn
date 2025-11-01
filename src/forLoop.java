public class forLoop
{
    public static void main(String[] args)
    {
        /*
        Create a program that counts down from 10 to 1, then prints "Happy New Year!"

        Requirements:
        Use a for loop
        Print each number on a new line
        After 1, print "Happy New Year!"
         */


        String happy = "Happy New Year!";

        for (int i = 10; i>=1; i--)
        {
            System.out.println(i);
            if (i == 1)
            {
                System.out.println(happy);
            }
        }
    }

}
