public class money
{
    public static void main(String[]args)
    {
        double cost = 19.99;
        int round = (int)cost;
        double cent = cost - round;

        System.out.println("double Cost: " + cost);
        System.out.println("int round: " + round);
        System.out.println("only cents: " + cent);
    }
}
