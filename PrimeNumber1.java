
import java.util.Scanner;

public class PrimeNumber1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        if (num == 2) {
            isPrime = true;
        } else {
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
