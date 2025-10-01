package MaiorOuMenor;
import java.util.Scanner;

public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA SEU NOME:");
        String nome = s.nextLine();
        System.out.println("INSIRA SUA IDADE:");
        int idade = s.nextInt();

        if (idade>=0&&idade<18) {
            System.out.println("NOME "+nome+"\n"+idade+" ANOS \n MENOR DE IDADE");
        } else if (idade>0&&idade>=18) {
            System.out.println("NOME "+nome+"\n"+idade+" ANOS \n MAIOR DE IDADE");
        }
    s.close();
    }
}
