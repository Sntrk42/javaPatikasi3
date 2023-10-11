import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int i, j, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        i = input.nextInt();
        System.out.println("Üs olacak sayı: ");
        j = input.nextInt();

        for(int k = 1; k <= j; k++){
            total *= i;
        }
        System.out.println("Cevap: " + total);

    }
}
