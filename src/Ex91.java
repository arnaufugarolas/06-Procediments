import java.text.Normalizer;
import java.util.Scanner;

public class Ex91 {
    static Scanner input = new Scanner(System.in);
    static Ex91 Main = new Ex91();

    public String llegirString() {
        System.out.print("Introdueix una frase: ");
        return input.next();
    }

    public int comptarA(String paraula) {
        int contador = 0;
        for (char lletra : Normalizer.normalize(paraula, Normalizer.Form.NFKD).toUpperCase().toCharArray()) if (lletra == 'A') contador++;
        return contador;
    }

    public static void main(String[] args) {
        boolean stop = false;
        while (!stop) {
            System.out.printf("Número d'As: %d \nVols introduir més paraules? (S/N): ", Main.comptarA(Main.llegirString()));
            if (input.next().toUpperCase().charAt(0) != 'S') stop = true;
        }
    }
    }
