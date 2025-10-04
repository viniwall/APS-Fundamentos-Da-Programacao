package Professor;
import java.util.Scanner; 

public class Professor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("INSIRA O SALÁRIO LÍQUIDO INICIAL");
        double SlrLiquidoIn = s.nextDouble();
        double VlrHoraAula = SlrLiquidoIn/40;
        double PrimeiraFaixa = 1518;
        double SegundaFaixa = 2793.88;
        double TerceiraFaixa = 4190.83;
        double QuartaFaixa = 8175.41;

        if (SlrLiquidoIn>PrimeiraFaixa) {
            double TaxaINSS = (SlrLiquidoIn*0.075);
            System.out.println("\nSALÁRIO LÍQUIDO: "+SlrLiquidoIn);
            System.out.println("SALÁRIO POR HORA AULA: "+VlrHoraAula);
            System.out.println("QUANTIDADE DE AULAS MENSAIS: 36 AULAS");
            System.out.println("TAXA DO INSS: "+TaxaINSS);
            System.out.println("SALÁRIO LÍQUIDO APÓS TAXA DO INSS: "+(SlrLiquidoIn-TaxaINSS));
            
        } else if (SlrLiquidoIn>SegundaFaixa) {
            double TaxaINSS = (SlrLiquidoIn*0.075)+(SlrLiquidoIn*0.09);
            System.out.println("\nSALÁRIO LÍQUIDO: "+SlrLiquidoIn);
            System.out.println("SALÁRIO POR HORA AULA: "+VlrHoraAula);
            System.out.println("QUANTIDADE DE AULAS MENSAIS: 36 AULAS");
            System.out.println("TAXA DO INSS: "+TaxaINSS);
            System.out.println("SALÁRIO LÍQUIDO APÓS TAXA DO INSS: "+(SlrLiquidoIn-TaxaINSS));
            
        } else if (SlrLiquidoIn>TerceiraFaixa) {
            double TaxaINSS = (SlrLiquidoIn*0.075)+(SlrLiquidoIn*0.09)+(SlrLiquidoIn*0.12);
            System.out.println("\nSALÁRIO LÍQUIDO: "+SlrLiquidoIn);
            System.out.println("SALÁRIO POR HORA AULA: "+VlrHoraAula);
            System.out.println("QUANTIDADE DE AULAS MENSAIS: 36 AULAS");
            System.out.println("TAXA DO INSS: "+TaxaINSS);
            System.out.println("SALÁRIO LÍQUIDO APÓS TAXA DO INSS: "+(SlrLiquidoIn-TaxaINSS));

        } else if (SlrLiquidoIn>QuartaFaixa) {
            double TaxaINSS = (SlrLiquidoIn*0.075)+(SlrLiquidoIn*0.09)+(SlrLiquidoIn*0.12)+(SlrLiquidoIn*0.14);
            System.out.println("\nSALÁRIO LÍQUIDO: "+SlrLiquidoIn);
            System.out.println("SALÁRIO POR HORA AULA: "+VlrHoraAula);
            System.out.println("QUANTIDADE DE AULAS MENSAIS: 36 AULAS");
            System.out.println("TAXA DO INSS: "+TaxaINSS);
            System.out.println("SALÁRIO LÍQUIDO APÓS TAXA DO INSS: "+(SlrLiquidoIn-TaxaINSS));

        } 
        s.close();
    }
}
