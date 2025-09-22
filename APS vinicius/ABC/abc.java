import java.util.Scanner;

public class abc {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //declarar as variáveis
        System.out.println("Insira o valor de A");
        double a = 0;
        System.out.println("Insira o valor de B");
        double b = 0;
        System.out.println("Insira o valor de C");
        double c = 0;
        double soma = a+b;
        System.out.println("SOMA ENTRE A & B: "+soma);

        if (soma > c) {
            System.out.println("A SOMA É MENOR QUE C");
            System.out.println("VALOR DE C "+c);
            System.out.println("DIFERENÇA: "+(c-soma));

        } else if (soma < c) {
            System.out.println("A SOMA É MAIOR QUE C");
            System.out.println("VALOR DE C "+c);
            System.out.println("DIFERENÇA ENTRE OS VALORES: "+(soma-c));
        }
        s.close();
    }
}