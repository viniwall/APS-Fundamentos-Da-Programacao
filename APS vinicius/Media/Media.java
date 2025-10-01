package Media;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA AS TRÊS NOTAS:");
        double Nota1 = s.nextDouble();
        double Nota2 = s.nextDouble();
        double Nota3 = s.nextDouble();

        double media = (Nota1+Nota2+Nota3)/3;

        System.out.println("SUA MÉDIA É: " + media);
    s.close();
    }
}
