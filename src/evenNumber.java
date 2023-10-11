import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        int input;

        Scanner inp = new Scanner(System.in);
        System.out.println("Hangi sayıya kadar çift sayıları bulalım? ");
        input = inp.nextInt();

        for (int i = 0; i <= input; i++){
            if(i % 2 == 0){
                System.out.println(i + "çift sayıdır!");
            }
        }
    }
}
