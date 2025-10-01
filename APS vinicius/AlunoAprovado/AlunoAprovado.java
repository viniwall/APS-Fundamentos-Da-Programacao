package AlunoAprovado;
import java.util.Scanner;

public class AlunoAprovado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA SEU NOME");
        String nome = s.nextLine();
        System.out.println("INSIRA AS QUATRO NOTAS:");
        double Nota1 = s.nextDouble();
        double Nota2 = s.nextDouble();
        double Nota3 = s.nextDouble();
        double Nota4 = s.nextDouble();

        double media = (Nota1+Nota2+Nota3+Nota4)/4;

        if (media<=7) {
            System.out.println("NOME DO ALUNO: "+nome);
            System.out.println("SITUAÇÃO: APROVADO");
        } else {
            System.out.println("NOME DO ALUNO: "+nome);
            System.out.println("SITUAÇÃO: REPROVADO");
        }

    s.close();
    }
}
