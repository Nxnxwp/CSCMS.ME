
import java.util.Scanner;

public class PatternCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = (2 * num) - 1;

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            if (i > 0) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < max; i++) {
            if (i < num || i == max - 1) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            for (int j = 1; j < num - i - 1; j++) {
                System.out.print("-");
            }
            if (i != num - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}