
import java.util.*;

public class PatternRectangle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        String text = "*";
        for (int i = 0; i < am; i++) {
            for (int a = 0; a < am; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}