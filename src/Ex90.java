import java.util.Scanner;

public class Ex90 {
    Scanner input = new Scanner(System.in);
    static Ex90 Main = new Ex90();

    public int Llegirenter() {
        System.out.print("Introdueix un valor: ");
        return input.nextInt();
    }

    public int mesGran(int [] valors) {
        int max = Integer.MIN_VALUE;
        for (int valor : valors) if (valor > max) max = valor;
        return max;
    }

    public int mesPetit(int [] valors) {
        int min = Integer.MAX_VALUE;
        for (int valor : valors) if (valor < min) min = valor;
        return min;
    }

    public double mitjana(int [] valors) {
        double suma = 0;
        for (int valor : valors) suma += valor;
        return suma/valors.length;
    }

    public static void main(String[] args) {
        boolean stop = false;
        int[] numbers = new int[0];
        int[] numbers2;
        int counter = 0;
        int majors = 0;
        while (!stop) {
            int number = Main.Llegirenter();
            if (number != 0) {
                numbers2 = numbers;
                numbers = new int[numbers.length + 1];
                System.arraycopy(numbers2, 0, numbers, 0, numbers2.length);
                numbers[counter] = number;
                counter ++;
            }
            else stop = true;
        }
        double mitjana = Main.mitjana(numbers);
        for (int number : numbers) if (number < mitjana) majors ++;
        System.out.printf("Número més gran: %d\nNúmero més petit: %d\nMitjana: %5.4f\nHi han %d números més grans que la mitjana", Main.mesGran(numbers), Main.mesPetit(numbers), mitjana, majors);
    }
}
