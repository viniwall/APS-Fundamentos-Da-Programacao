package Pagamento;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        boolean repetir = true;
        Scanner s = new Scanner(System.in);

        while (repetir) {
        System.out.println("INSIRA O VALOR DO PRODUTO:");
        double valor = s.nextDouble();

        System.out.println("INSIRA O CÓDIGO DE PAGAMENTO QUE SERÁ UTILIZADO:"+
        "\n"+"1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto"+
        "\n"+"2 - À Vista no cartão de crédito, recebe 10% de desconto"+
        "\n"+"3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros"+
        "\n"+"4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int CodDePagamento = s.nextInt();
        s.nextLine();
        
        switch (CodDePagamento) {
            case 1:
            double valorReajustadoPix = valor-(valor*0.15);
            System.out.println("VALOR COM DESCONTO: "+valorReajustadoPix);
            break;

            case 2:
            double valorReajustadoCred = valor-(valor*0.10);
            System.out.println("VALOR COM DESCONTO: "+valorReajustadoCred);
            break;

            case 3:
            double valorReajustadoParc2x = valor/2;
            System.out.println("VALOR POR PARCELA: "+valorReajustadoParc2x+"\n TOTAL: "+valor);
            break;

            case 4: 
            double juros = valor*0.10*3;
            double valorReajustadoParc3x = valor+juros/3;
            System.out.println("VALOR POR PARCELA: "+valorReajustadoParc3x+"\n TOTAL: "+(valor+juros));
            break;
        }

        System.out.println("REPETIR CÁLCULO?");
        String resposta = s.nextLine();
        if (!resposta.equalsIgnoreCase("s")) {
            repetir = false;
        }
    }
    s.close();
    }
}
