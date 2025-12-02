import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;



public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */
        /*
        while (true)
        {
            R = input.nextInt();
            if ((R <= 8) && R >= (int)(Math.pow(10,9)) )
            {
                break;
            }
            System.out.println("the number has to be between 8 and 10^9");
        }

        while (true)
        {
            B = input.nextInt();
            if ((B <= R) && B >= (int)(Math.pow(10,9)) )
            {
                break;
            }
            System.out.println("the number has to be between 8 and 10^9");
        }


         */
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Введи число от 8 до 10^9");
        System.out.println("Введи число от 1 до 10^9");


         */
        String [] strs = reader.readLine().split(" ");


        int B = Integer.parseInt(strs[1]);
        int R = Integer.parseInt(strs[0]);


        int S = (R + 4)/2;
        int P = B + 2 * S - 4;
        int D = S * S - 4 * P;
        int sqrt = (int)Math.sqrt(D);
        int W = (S + sqrt)/2;
        int H = (S - sqrt)/2;

        System.out.println(W+ " " + " "+H);
        //int R = 2W + 2H - 4;
        //int B = (W - 2)(H - 2);

        reader.close();
        writer.close();
    }
}
