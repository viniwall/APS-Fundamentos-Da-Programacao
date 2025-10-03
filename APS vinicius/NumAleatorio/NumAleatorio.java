package NumAleatorio;
import java.util.Random;

public class NumAleatorio {
    public static void main(String[] args) {
        Random a = new Random();

        int aleatorio = a.nextInt(100);
        System.out.println(aleatorio);
        
    }
}
