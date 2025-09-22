package A_B;
import java.util.Scanner;

public class a_b {
    public static void main(String[] args) {
        //declaração do Scanner S
        Scanner s = new Scanner(System.in);
        //declaração de 'repetir' como true, para repetição do cálculo
        boolean repetir = true;

        // abertura da condição while para repetição do cálculo
        while (repetir) {
        // declaração de variáveis 
        System.out.println("INSIRA O VALOR DE A");
        int valorA = s.nextInt();
        System.out.println("INSIRA O VALOR DE B");
        int valorB = s.nextInt();
        s.nextLine();
        int valorC = 0;
        
        // condição criada para calcular oque foi pedido
        if (valorA==valorB) {
            valorC = (valorA + valorB);
        } else {
            valorC = (valorA * valorB);
        }

        // impressão de respostas
        System.out.println("VALOR DE A: "+valorA);
        System.out.println("VALOR DE B: "+valorB);
        System.out.println("VALOR DE C: "+valorC);
        System.out.println("CALCULAR NOVAMENTE?  (S/N)");
        String resposta = s.nextLine();

        // condição para receber a resposta e repetir ou não
        if (!resposta.equalsIgnoreCase("s")) {
            repetir = false;
        }

        }
        s.close();
    }
}