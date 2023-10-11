import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmas yüksekliğini giriniz (tek sayı): ");
        int yukseklik = scanner.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
            return;
        }

        int bosluk = yukseklik / 2;
        int yildiz = 1;

        // Elmasın üst kısmını oluştur
        for (int i = 1; i <= yukseklik; i += 2) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            System.out.println();
            bosluk--;
            yildiz += 2;
        }

        bosluk = 1;
        yildiz = yukseklik - 2;

        // Elmasın alt kısmını oluştur
        for (int i = yukseklik - 2; i >= 1; i -= 2) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            System.out.println();
            bosluk++;
            yildiz -= 2;
        }

        scanner.close();
    }
}
