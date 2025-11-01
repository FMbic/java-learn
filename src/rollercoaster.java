import java.util.Scanner;
/*
You're at a theme park! To ride, you must be above a certain height and weight.
Otherwise, you'll have to wait until next year.

Create a program that checks if you can ride the rollercoaster
if you weigh above 40 kg and are taller than 120 cm.

If both conditions are met, print “Congrats! You can ride!” 🎢
Otherwise, “Sorry, You can't ride today.” 😞

int speedLimit = 30;
int drivingSpeed = 25;
boolean schoolZone = false;

if ( drivingSpeed < speedLimit && schoolZone) {
    System.out.println("You are being a safe driver!");
} else if (drivingSpeed > speedLimit || schoolZone) {
    System.out.println("Slow down!");
} else {
    System.out.println("Careful driving!");
}
 */

public class rollercoaster
{
    public static void main (String[] args)
    {

        System.out.println("Welcome to the rollercoaster!\nYou can ride the rollercoaster if you weigh above 40 kg and are taller than 120 cm.");
        int height = 120;
        int weight = 40;

        System.out.println("My height " + height);
        System.out.println("My weight " + weight);

        if  (weight >= 40 && height >= 120) {
            System.out.println("Congrats! You can ride! \uD83C\uDFA2");
        } else if (weight >= 40 && height <= 120) {
            System.out.println("Come back when you will get taller");
        } else if (weight <= 40 && height >= 120) {
            System.out.println("Come back when you get a bit more weight");
        } else {
            System.out.println("You cant ride today!");
        }

    }

}