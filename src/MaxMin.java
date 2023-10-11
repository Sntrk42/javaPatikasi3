import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int i = input.nextInt();

        System.out.print("Sayı 1: ");
        int firstNumber = input.nextInt();
        int min = firstNumber;
        int max = firstNumber;

        for (int j = 2; j <= i; j++){
            System.out.print("Sayı " + (j) + ": ");
            int number = input.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
