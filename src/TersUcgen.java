import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < number; i++) {

            for (int k = 0; k < number - i; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
