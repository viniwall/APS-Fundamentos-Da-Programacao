package GasolinaLitros;
import java.util.Scanner;

public class GasolinaLitros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("INSIRA O TEMPO DE VIAGEM (EM HORAS):");
            double Tempo = s.nextDouble();
            System.out.println("INSIRA A VELOCIDADE MÉDIA:");
            double Velocidade = s.nextDouble();
            s.nextLine();

            double Dist = Tempo*Velocidade;
            double Litros = Dist/12;

            System.out.println("O TEMPO GASTO FOI DE "+Tempo+" HORAS");
            System.out.println("A VELOCIDADE MÉDIA FOI DE "+Velocidade+" KM/H");
            System.out.println("A DISTÂNCIA PERCORRIDA FOI DE "+Dist+" Kms");
            System.out.println("FORAM GASTOS "+Litros+" LITROS DE GASOLINA");
            
            System.out.println("REPETIR CÓDIGO?");
            String resposta = s.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                repetir = false;
            }
        }
        s.close();
    }
}
