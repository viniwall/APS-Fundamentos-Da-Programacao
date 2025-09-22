package salario;
import java.util.Scanner;

public class SalarioMin {
    public static void main(String[] args) {
        // declaração do Scanner s
        Scanner s = new Scanner(System.in);
        // declaração de repetir como true, para repetição do código
        boolean repetir = true;

        // uso do loop while para repetição do código
        while (repetir) {
        System.out.println("INSIRA SEU SALÁRIO");
        // uso de condição, para conferir o input como uma variável double, evitando erros
        if (s.hasNextDouble()) {
            double salarioPessoal = s.nextDouble();
            s.nextLine();

            double salarioMinimo = 1293.20;

            // cálculo da quantidade de salários mínimos
            double salarioMinQuant = salarioPessoal/salarioMinimo;

            // impressão de resultados
            System.out.println("SEU SALÁRIO EQUIVALE A "+salarioMinQuant+"SALÁRIOS MÍNIMOS");

            // repetição do cálculo
            System.out.println("REPETIR CÁLCULO? S/N");
            String resposta = s.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
            repetir = false;
            }

        } else {
            /*em caso de um input que não seja uma variável double,
            o código se repete automaticamente, explicando a possível causa do erro */
            System.out.println("INSIRA UM VALOR VÁLIDO (SEM LETRAS OU SÍMBOLOS (.,/,#,$, ETC.))");
            /* uso de nextLine para consumir o input errado, fazendo o código aguardar um novo input,
            usei este para evitar uma repetição infinita do código */
            s.nextLine();
            repetir = true;
        }
        }
        s.close();

    }

}
