import java.util.Scanner;

/*
Remember the last exercise when we only gave out a coupon code to cat owners?
Let's also give one to dog owners! We can't leave them out. 😞

Create two boolean variables, isCatOwner and isDogOwner and give them each a value.
Write a program that gives the following specials:

Use the code MEOW for 20% off cat items.
Use the code WOOF for 20% off dog items.
If you're neither a cat nor dog pet owner, write a generic “Welcome to the pet store!” message.

int temp = 90;

if (temp < 40) {
    System.out.println("It may be snowing! ❄️");
} else if (temp < 80) {
    System.out.println("Enjoy the weather! 👌");
} else {
    System.out.println("Okay... It is getting a little hot in here. 🔥");
}
 */


public class dog {
    public static void main(String[] args) {
        boolean isCatOwner = false;
        boolean isDogOwner = false;

        if (isCatOwner && isDogOwner) {
            System.out.println("Use the code MEOW for 20% off cat items and Use the code WOOF for 20% off dog items.");
        } else if (isCatOwner) {
            System.out.println("Use the code MEOW for 20% off cat items");
        } else if (isDogOwner){
            System.out.println("Use the code WOOF for 20% off dog items");
        } else {
            System.out.println("You don't have any pets");
        }


    }
}
