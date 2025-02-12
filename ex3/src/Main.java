import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a NP1:");
        int np1 = entrada.nextInt();
        System.out.println("Insira a NP2:");
        int np2 = entrada.nextInt();

        entrada.close();

        int media = np1+np2/2;

        if (media >= 60) {
            System.out.println("Você não precisa fazer NP3, parabéns!");
        }

        else {
            System.out.println("Você está de NP3.");
        }
    }
}