package tresValores;
import java.util.Scanner;

public class tresValores {
    public static void main(String[] args) {
        boolean repetir = true;
        Scanner s = new Scanner(System.in); 

        while (repetir) {
        System.out.println("INSIRA TRêS VALORES:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int temp; 

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("ORDEM CRESCENTE DOS VALORES: " + a + " " + b + " " + c);

        System.out.println("REPETIR CÁLCULO?");
        String resposta = s.nextLine();
        s.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            repetir = true;
        }
        } 

        s.close();
    }
}