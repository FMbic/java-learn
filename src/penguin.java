import java.util.Scanner;

public class penguin {

    public static void main(String[] args) {
        double clubPeng = 0.0045;

        System.out.println("Enter the number of coins you have to see your amount in USD");
        Scanner coin = new Scanner(System.in);
        int amount = coin.nextInt();
        // int money = (int) amount;

        // int money2 = Math.toIntExact(Math.round(amount));
        System.out.println(clubPeng*amount + " USD");

    }
}
