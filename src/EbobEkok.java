import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1, k;
        k = n1;
        while (k >= 1){
            k--;
            if (n1 % k == 0 && n2 % k == 0){
                ebob = k;
                System.out.println("EBOB: " + ebob);
                break;
            }
        }
        int i = 1;
        while (i <= (n1 * n2)){
            i++;
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("EKOK: " + i);
                break;
            }
        }

    }
}
