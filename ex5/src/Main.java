import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        System.out.println("qual número foi gerado?");
        int  y;
        do {
            Scanner entrada = new Scanner(System.in);
            y = entrada.nextInt();

            if (x < y)
                System.out.println("menos");
            else
                System.out.println("mais");
        }
        while (x != y);
        System.out.println("acertou.");

    }
}
