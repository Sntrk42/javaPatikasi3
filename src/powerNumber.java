import java.util.Scanner;

public class powerNumber {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır sayısı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i*=4){
            System.out.println(i + " dördün kuvvetleri");
        }
        for (int j = 1; j <= n; j*=5){
            System.out.println(j + " beşin kuvvetleri");
        }
    }
}
