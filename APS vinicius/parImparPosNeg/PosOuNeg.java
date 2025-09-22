package parImparPosNeg;
import java.util.Scanner;

public class PosOuNeg {
    public static void main(String[] args) {
        //DECLARAÇÃO DO SCANNER
        Scanner s = new Scanner(System.in);
        //uso de boolean para declarar 'repetir' como verdadeiro
        boolean repetir = true;

        //início do loop para possível repetição do código
        while (repetir) {
        //recebimento da entrada
        System.out.println("INSIRA O VALOR");
        double valor = s.nextDouble();
        /*esta linha serve para tomar
         o lugar da linha que sobra,
         fazendo com que seja possível 
         a repetição do código (pedi ajuda do chat)*/ 
        s.nextDouble();
        /*condições que dirão se o número é 
        positivo ou negativo, par ou impar*/
        if (valor % 2 !=0) {
            System.out.println("O VALOR "+valor+" É ÍMPAR");
        } else if (valor % 2 != 1) {
            System.out.println("O VALOR "+valor+" É PAR");
        } else if (valor > 0 ){
            System.out.println("O VALOR "+valor+" É POSITIVO");
        } else if (valor < 0) {
            System.out.println("O VALOR "+valor+" É NEGATIVO");
        }
        //finalização do código com a entrada de dados para possível repetição
        System.out.println("DESEJA REPETIR? (S/N)");
        String resposta = s.nextLine();
        if (!resposta.equalsIgnoreCase("s")) {
            repetir = false;
        } 

        }
        s.close();
    }
}
