public class celcius
{
    public static void main(String [] args)
    {
        int celT = 25;
        double farT = celT;
        /// double bbC = (int) farT;

        int faren = (int) (celT * 9/5) + 32;

        double fhcast = (int) faren;

        System.out.println("Celcius int: " + celT);
        System.out.println("Celcius aouble: " + farT);
        System.out.println("FH double: " + fhcast);
        System.out.println("FH with formula: " + faren);

    }
}
