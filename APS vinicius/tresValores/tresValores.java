package tresValores;
import java.util.Scanner;

public class tresValores {
   static int CalcMenorValor(int x ){
        
   }
   static int CalcMedioValor(){

   }
   static int CalcMaiorValor(){

   }
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                System.out.println("INSIRA OS TRÊS VALORES:");
                int menorValor = s.nextInt();
                int medioValor = s.nextInt();
                int maiorValor = s.nextInt();

                System.out.println("MENOR VALOR: "+menorValor);
                System.out.println("VALOR MÉDIO: "+medioValor);
                System.out.println("MAIOR VALOR: "+maiorValor);
                
                s.close();
        }
}