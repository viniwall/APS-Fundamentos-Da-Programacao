package cincoprcnt;

import java.util.Scanner;

public class cincoPrcnt {
    // método criado para calcular a porcentagem
    static double porcentagemMetodo(double x) {
       return x + (x*0.05);
    }
    public static void main(String[] args) {
        // declaração do Scanner s
        Scanner s = new Scanner(System.in); 
        // uso de boolean para a repetição do código
        boolean repetir = true; 

        // uso do loop while para repetição do código
        while (repetir) {
            System.out.println("INSIRA O VALOR");
            /* condição usada para receber apenas variaveis double corretas,
            para evitar bugs */
            if (s.hasNextDouble()) {
            double valor = s.nextDouble();
            s.nextLine();

            // impressão dos valores com reajuste 
            System.out.println("VALOR COM REAJUSTE (5%): "+porcentagemMetodo(valor));
            } else {
                System.out.println("INSIRA UM VALOR VÁLIDO (SEM LETRAS E SÍMBOLOS .,/,#,$, ETC.)");
                s.nextLine();
                repetir = true;
            }
            // repetição do código de acordo com input entregue pelo usuário
            System.out.println("REPETIR CÁLCULO? S/N");
            String resposta = s.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                repetir = false;
            }
        }
        s.close();
    }
}
