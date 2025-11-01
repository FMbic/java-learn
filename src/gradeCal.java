public class gradeCal
{
    public static void main(String[]args)
    {
        double per = 70;
        int conv = (int)per;
        Boolean passing = conv >= 60;

        if (passing == true)
        {
            System.out.println("You have passed");
        } else {
            System.out.println("You have not passed");
        }

    }
}
