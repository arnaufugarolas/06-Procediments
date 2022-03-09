import java.util.Scanner;

public class Ex89 {
    Scanner input = new Scanner(System.in);
    static Ex89 Main = new Ex89();

    public int LlegirEnter() {
        System.out.print("Introdueix un valor: ");
        return input.nextInt();
    }

    public boolean esDivisor(int Divisor, int Divident) {
        return Divisor % Divident == 0;
    }

    public static void main(String[] args) {
        int[] numbers = new int[0];
        int[] numbers2;
        int counter = 0;
        boolean stop = false;
        int length;
        while (!stop) {
            int number = Main.LlegirEnter();
            if (number != 0) {
                numbers2 = numbers;
                numbers = new int[numbers.length + 1];
                System.arraycopy(numbers2, 0, numbers, 0, numbers2.length);
                numbers[counter] = number;
                counter ++;
            }
            else {
                stop = true;
            }
        }
        length = numbers.length;
        if (!(length % 2 == 0)) length --;
        for (int contador = 0; contador != length; contador += 2) {
            if (Main.esDivisor(numbers[contador], numbers[contador + 1])) System.out.printf("%d i %d són divisors\n", numbers[contador], numbers[contador + 1]);
            else System.out.printf("%d i %d no són divisors\n", numbers[contador], numbers[contador + 1]);
        }
    }

}
