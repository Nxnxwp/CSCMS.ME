
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        if (-1000000 > a || -1000000 > c) {
            System.out.println("error");
        }

        if (a > 1000000 || c > 1000000) {
            System.out.println("error");
        }

        if ((b == '/' || b == '%') && c == 0) {
            System.out.println("error");
        } else {
            switch (b) {
                case '+':
                    System.out.println(a + c);
                    break;
                case '-':
                    System.out.println(a - c);
                    break;
                case '*':
                    System.out.println(a * c);
                    break;
                case '/':
                    System.out.println(a / c);
                    break;
                case '%':
                    System.out.println(a % c);
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}
