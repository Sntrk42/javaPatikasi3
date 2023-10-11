import java.util.*;
import java.io.*;

class javaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        // s0 = a + 2^0 * b
        // s1 = a + 2^0 * b + 2^1 * b
        // s2 = a + 2^0 * b + 2^1 * b + 2^n-1 * b

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for (int j = 0; j <= (n - 1); j++){
                result += Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}