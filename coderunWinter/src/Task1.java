import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Task1 {

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */
        Scanner input = new Scanner(System.in);

        int R = 0;
        int B = 0;

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






        //int R = 2W + 2H - 4;
        //int B = (W - 2)(H - 2);

        reader.close();
        writer.close();
    }
}
}