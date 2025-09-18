
import java.util.Scanner;

public class Jin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        long[] arr = new long[am];
        for (int i = 0; i < am; i++) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            arr[i] = (m - n + 1) * (n + m) / 2;
        }
        for (long j : arr) {
            System.out.println(j);
        }
    }
}
