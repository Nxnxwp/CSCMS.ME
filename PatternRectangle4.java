
import java.util.*;

public class PatternRectangle4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lam = sc.nextInt();
        int am = sc.nextInt();

        for (int i = 0; i < lam; i++) {
            for (int j = 0; j < am; j++) {
                    if (i == 0 || i == lam - 1 || j == 0 || j == am - 1) {
                    System.out.print("*");
                } else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
