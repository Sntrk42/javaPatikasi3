import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasındaki asal sayılar:");

        for (int number = 2; number <= 100; number++) {
            boolean prime = true;

            // Sayının bölenlerini kontrol et
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break; // Sayı bölene bölünebilirse asal değildir.
                }
            }

            // Eğer asalsa ekrana yazdır
            if (prime) {
                System.out.print(number + " ");
            }
        }
    }
}
