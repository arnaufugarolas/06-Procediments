import java.util.Scanner;

public class Ex88 {
    Scanner input = new Scanner(System.in);
    static Ex88 Main = new Ex88();

    public int LlegirEnter() {
        System.out.print("Introdueix un valor: ");
        return input.nextInt();
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



    }
}

/*
88. Desenvolupar un programa per tal de demanar un conjunt de números pel teclat, finalitzant la
sèrie amb el 0. Una vegada tots els números introduïts caldrà dir per a cada número quin és el seu
factorial. Caldrà desenvolupar els següent mètodes
• int LlegirEnter();
• int factorial(int numero); ‘ El factorial d’un número negatiu es 0
 */