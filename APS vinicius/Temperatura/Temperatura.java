package Temperatura;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA A TEMPERATURA EM FAHRENHEIT:");
        double TempFah = s.nextDouble();
        double tempC = (5 * (TempFah-32) / 9);

        System.out.println("C°: "+tempC+"\nF°: "+TempFah);

        s.close();
    }
}