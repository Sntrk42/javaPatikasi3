import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sınırlayıcı sayı giriniz: ");
        int i = input.nextInt();

        int first = 0, second = 1, k = 0;

        System.out.println(k + "");
        for(int j = 3; j <= i; j++){
            int next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }
}
