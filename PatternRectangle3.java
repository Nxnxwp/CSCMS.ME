
import java.util.Scanner;

public class PatternRectangle3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();

        for (int i = 0; i < am; i++) {
            if (i == 0 || i == am - 1) { // Determine/Define First Line & Last Line
                System.out.print("-"); // First Char print -
                for (int j = 0; j < am - 2; j++) {
                    System.out.print("*"); // All Middle Char print *
                }
                System.out.println("-"); // Last Char print -
            } else {
                for (int j = 0; j < am ; j++){
                    System.out.print("*"); // Another Line print *
                }
                System.out.println();
            }
        }
    }
}
