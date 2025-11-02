public class shoppingCartArray
{



    public static void main(String[] args)
    {
        int [] prices = {12,54,90,643};
        int totalCost = 0;

        for (int i = 0; i < prices.length; i ++)
        {
            totalCost =  totalCost + prices[i];
        }

        if (totalCost > 100)
        {
            int discount = (int)(totalCost * 0.10);
            totalCost = totalCost - discount;
        }

        System.out.println("Total cost is " + totalCost);
    }
}
