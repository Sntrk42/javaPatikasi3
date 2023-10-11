import java.util.Scanner;

public class basamakSayilari {
    public static void main(String[] args) {
        int i,k = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        i = input.nextInt();

        // 1643 % 10 = 3 , 1643 % 100 = 40 etc.
        while (i > 0){
            int a = i % 10;
            k = k + a;
            i /= 10;
        }
        System.out.println("Toplam: " + k);


    }
}
