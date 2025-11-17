import java.util.Random;

public class coinFlip
{
    int heads = 0;
    int tails = 0;

    public void flip ()
    {

        /// double rand = Math.round(Math.random());

        boolean isHeads = Math.random() < 0.5;

        for (int i = 1; i <= 1; i++)

            if (isHeads)
            {
                heads++;
            }
            else
            {
                tails++;
            }
    }

    public String getStats()
    {
        int heads1 = this.heads;
        int tails1 = this.tails;
        return "Heads "+heads1+" Tails "+tails1;
    }

    public static void main(String[]args)
    {
        coinFlip flp = new coinFlip();
        flp.flip();
        System.out.println(flp.getStats());
    }
}
