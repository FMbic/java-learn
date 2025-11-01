import java.util.Scanner;

/*
The pet store wants to send you a coupon if you're a cat owner! 🐈
Write a program with a isCatOwner variable, either true or false.
If true, print “20% off select cat items with code MEOW2025”.
Otherwise, print a generic “Welcome to the Pets Pets Pets store!” message.
 */

public class outmeal {
    public static void main(String[] args) {

        System.out.println("Are you a cat owner?");
        System.out.println("Type either yes or no");
        Scanner desition = new Scanner(System.in);

        boolean isCatOwner = true;

        String choise = desition.nextLine().toLowerCase();

        boolean ask;
        if (choise.equals("yes")) {
            ask = true;
        } else {
            ask = false;
        }

        if (ask == isCatOwner) {
            System.out.println("Here is a cupon code for cat owners 20% off select cat items with code MEOW2025");
        } else {
                System.out.println("Иди на хуй отсюда");

        }
    }
}
    /*
        boolean isCatOwner = true;




    if (isCatOwner == desition){
        System.out.println("Here is a cupon code for cat owners “20% off select cat items with code MEOW2025”");
    }
        else
            System.out.println("You are not a cat owner!");
    }
}
*/