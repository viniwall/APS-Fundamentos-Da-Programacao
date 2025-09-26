package obesidade;
import java.util.Scanner;

public class obesidade {
    public static void main(String[] args) {
        boolean repetir = true;
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA O PESO");
        double peso = s.nextDouble();
        System.out.println("INSIRA A ALTURA");
        double altura = s.nextDouble();
        double imc = peso/(altura*altura);
        
        for (double imc = 18.5;imc <= 18.5;imc --) {

        }
    } 
}