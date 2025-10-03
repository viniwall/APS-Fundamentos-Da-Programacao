package QuocienteEResto;
import java.util.Scanner;
public class QuocienteEResto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA O DIVIDENDO");
        double dividendo = s.nextDouble();
        System.out.println("INSIRA O DIVISOR");
        double divisor = s.nextDouble();

        double quociente = dividendo/divisor;
        double resto = dividendo % divisor;
        System.out.println("O QUOCIENTE DA DIVISÃO É: "+quociente+"\nE O RESTO DA DIVISÃO É: "+resto);

        s.close();
    }
}
