
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        int next = 0;
        for (int i = 0; i < num; i++) {
            System.out.print(f0 + " ");
            f0 = f1;
            f1 = next;
            next = f0 + f1;
        }
    }
}