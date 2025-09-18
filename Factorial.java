
import java.util.Scanner;

class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long Ans = 1;
        for (int i = 1; i <= num; i++) {
            Ans *= i;
        }
        System.out.println(Ans);
    }
}