import java.text.Normalizer;
import java.util.Scanner;

public class Ex93 {
    static Scanner input = new Scanner(System.in);
    static Ex93 Main = new Ex93();

    public String llegirString() {
        System.out.print("Introdueix una frase: ");
        return input.next();
    }

    public int comptarLletra(String paraula, char caracter) {
        int contador = 0;
        for (char lletra : Normalizer.normalize(paraula, Normalizer.Form.NFKD).toUpperCase().toCharArray())
            if (lletra == caracter) contador++;
        return contador;
    }

    public char[] lletresDiferents(String paraula) {
        StringBuilder lletres = new StringBuilder();
        for (char caracter : Normalizer.normalize(paraula, Normalizer.Form.NFKD).toUpperCase().toCharArray())
            if (!lletres.toString().contains(String.valueOf(caracter))) lletres.append(caracter);
        return lletres.toString().toCharArray();
    }

    public static void main(String[] args) {
        boolean stop = false;
        while (!stop) {
            String frase = Main.llegirString();
            for (char caracter : Main.lletresDiferents(frase))
                System.out.printf("LLetra %c %d vegade/s\n", caracter, Main.comptarLletra(frase, caracter));
            System.out.print("Vols introduir més paraules? (S/N):\s");
            if (input.next().toUpperCase().charAt(0) != 'S') stop = true;
        }
    }
}
