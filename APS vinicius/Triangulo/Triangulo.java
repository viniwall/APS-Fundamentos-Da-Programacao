package Triangulo;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
        System.out.println("\nINSIRA O VALOR DO LADO A");
        double LadoA = s.nextDouble();
        System.out.println("\nINSIRA O VALOR DO LADO B");
        double LadoB = s.nextDouble();
        System.out.println("\nINSIRA O VALOR DO LADO C");
        double LadoC = s.nextDouble();
        s.nextLine();

        if (!(LadoA + LadoB > LadoC && LadoA + LadoC > LadoB && LadoB + LadoC > LadoA)){
            System.out.println("\nINSIRA VALORES VÁLIDOS PARA O TRIÂNGULO");
        } else if (LadoA==LadoB&&LadoB==LadoC) {
            System.out.println("\nO TRIÂNGULO É EQUILÁTERO\nVALOR DO LADO A: "+LadoA+"\nVALOR DO LADO B: "+LadoB+"\nVALOR DO LADO C: "+LadoC);
        } 
        else if (LadoA==LadoB&&LadoB!=LadoC) {
            System.out.println("\nO TRIÂNGULO É ISÓCELE\nVALOR DO LADO A: "+LadoA+"\nVALOR DO LADO B: "+LadoB+"\nVALOR DO LADO C: "+LadoC);
        } 
        else if (LadoA!=LadoB&&LadoB==LadoC) {
            System.out.println("\nO TRIÂNGULO É ISÓCELE\nVALOR DO LADO A: "+LadoA+"\nVALOR DO LADO B: "+LadoB+"\nVALOR DO LADO C: "+LadoC);
        } 
        else if (LadoA==LadoC&&LadoB!=LadoC) {
            System.out.println("\nO TRIÂNGULO É ISÓCELE\nVALOR DO LADO A: "+LadoA+"\nVALOR DO LADO B: "+LadoB+"\nVALOR DO LADO C: "+LadoC);
        } 
        else if (LadoA!=LadoB&&LadoB!=LadoC&&LadoA!=LadoC) {
            System.out.println("\nO TRIÂNGULO É ESCALENO\nVALOR DO LADO A: "+LadoA+"\nVALOR DO LADO B: "+LadoB+"\nVALOR DO LADO C: "+LadoC);
        }
            
        System.out.println("\nREPETIR CÓDIGO?");
        String resposta = s.nextLine();
        if (!resposta.equalsIgnoreCase("s")) {
            repetir = false;
        }
    }

        s.close();
    }
}
