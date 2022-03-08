import java.text.Normalizer;
import java.util.Scanner;

public class Ex92 {
    static Scanner input = new Scanner(System.in);
    static Ex92 Main = new Ex92();

    public String llegirString() {
        System.out.print("Introdueix una frase: ");
        return input.next();
    }

    public int comptarLletra(String paraula, char caracter) {
        int contador = 0;
        for (char lletra : Normalizer.normalize(paraula, Normalizer.Form.NFKD).toUpperCase().toCharArray()) if (lletra == caracter) contador++;
        return contador;
    }

    public static void main(String[] args) {
        boolean stop = false;
        while (!stop) {
            String frase = Main.llegirString();
            System.out.printf("""
                            Número d'As: %d
                            Número d'Es: %d
                            Número d'Is: %d
                            Número d'Os: %d
                            Número d'Us: %d
                            Vols introduir més paraules? (S/N):\s""",
                    Main.comptarLletra(frase, 'A'), Main.comptarLletra(frase, 'E'), Main.comptarLletra(frase, 'I'), Main.comptarLletra(frase, 'O'), Main.comptarLletra(frase, 'U'));
            if (input.next().toUpperCase().charAt(0) != 'S') stop = true;
        }
    }
}
