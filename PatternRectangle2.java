
import java.util.Scanner;

public class PatternRectangle2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lam = sc.nextInt();
        int am = sc.nextInt();
        String text = "*";
        for (int i = 0; i < lam; i++) {
            for (int j = 0; j < am; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }
}
