import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        int toplam = 0,i, k;

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Bir sayı giriniz: ");
            i = input.nextInt();

            if (i == -1){
                break;
            }
            if(i % 2 == 0 && i % 4 == 0){
                toplam += i;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
        input.close();
    }
}
