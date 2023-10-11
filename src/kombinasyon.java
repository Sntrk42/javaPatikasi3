import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int n, r, totalN = 1, totalR = 1, total= 1;

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("R sayısını giriniz: ");
        r = input.nextInt();

        for(int i = 1; i <= n; i++){
            totalN = totalN * i;
        }
        for(int j = 1; j <= r; j++){
            totalR = totalR * j;
        }
        for(int k = 1; k <= (n-r); k++){
            total = total * k;
        }
        double fak = ((double) totalN / totalR * total);
        System.out.println(fak);
    }
}
