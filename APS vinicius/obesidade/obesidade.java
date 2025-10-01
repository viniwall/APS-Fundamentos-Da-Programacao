package obesidade;
import java.util.Scanner;

public class obesidade {
    public static void main(String[] args) {
        boolean repetir = true;
        Scanner s = new Scanner(System.in);

        while (repetir) {
        System.out.println("INSIRA O PESO");
        double peso = s.nextDouble();
        s.nextLine();
        System.out.println("INSIRA A ALTURA");
        double altura = s.nextDouble();
        s.nextLine();
        double imc = peso/(altura*altura);
        
        if (imc<18.5) {
            System.out.println("VOCÊ ESTA ABAIXO DO PESO IDEAL!");
        } else if (imc>18.6&&imc<24.9) {
            System.out.println("VOCÊ ESTA DENTRO DO PESO IDEAL. PARABÉNS!");
        } else if (imc>25&&imc<29.9) {
            System.out.println("VOCÊ ESTA LEVEMENTE ACIMA DO PESO!");
        } else if (30<imc&&imc>34.9) {
            System.out.println("VOCÊ TEM OBESIDADE GRAU 1");
        } else if (35<imc&&imc>39.9) {
            System.out.println("VOCÊ TEM OBESIDADE GRAU 2 (SEVERA)");
        } else if (imc>40) {
            System.out.println("VOCÊ TEM OBESIDADE GRAU 4 (MORBIDA). PROCURE AJUDA!");
        }
        System.out.println("REPETIR CÁLCULO?");
        String resposta = s.nextLine();
        if (!resposta.equalsIgnoreCase("s")) {
            repetir = false;
        }
    }
    s.close();
    } 
}