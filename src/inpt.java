import java.util.Scanner;

public class inpt {
    public static void main (String  [] args ){
        System.out.println("Here is a riddle for you");
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me an answer to the riddle");
        String an = sc.nextLine();

        System.out.println(an);

        System.out.println("Congrats on guessing");
    }
}
