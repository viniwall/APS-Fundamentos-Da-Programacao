package ant_e_succ;
import java.util.Scanner;

public class ant_e_succ {
    // metodo criado para calcular os valores antecessores e sucessores
    static int calculadora(int succ) {
        return 1 + succ; 
    } 
    static int calculadora2(int ant) {
        return ant - 1;
    }
    public static void main(String[] args) {
        // declaração do scanner s
        Scanner s = new Scanner(System.in);
        // declaração de repetir como true para a repetição do codigo
        boolean repetir = true; 

        // criação de um loop para a repetição do código
        while (repetir) {

            System.out.println("INSIRA O VALOR");
            int valor = s.nextInt();
            s.nextLine();
            // uso do método para o cálculo
            System.out.println("VALOR ANTECESSOR: "+calculadora2(valor));
            System.out.println("VALOR SUCESSOR: "+calculadora(valor));

            // criação da condição para repetição do código
            System.out.println("REPETIR CÁLCULO? S/N");
            String resposta = s.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                repetir = false;
            }

        }
        s.close();
    }
    
}
