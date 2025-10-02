package AeB;
import java.util.Scanner;

public class AeB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA O VALOR DE A");
        double valorA = s.nextDouble();
        System.out.println("INSIRA O VALOR DE B");
        double valorB = s.nextDouble();

        if (valorA==valorA&&valorB==valorB) {
            valorA = valorB;
            System.out.println("VALOR A: "+valorA+"\nVALOR B: "+valorB);
        }



        s.close();
    }
}
