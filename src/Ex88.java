import java.util.Scanner;

public class Ex88 {
    Scanner input = new Scanner(System.in);
    static Ex88 Main = new Ex88();

    public int LlegirEnter() {
        System.out.print("Introdueix un valor: ");
        return input.nextInt();
    }

    public int Factorial(int number) {
        if (number <= 0) {
            return 0;
        }
        else {
            int factorial = 1;
            for(int i = 1; i <= number; i++){
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[0];
        int[] numbers2;
        int counter = 0;
        boolean stop = false;
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
        for (int number : numbers) {
            System.out.println(Main.Factorial(number));
        }
    }
}