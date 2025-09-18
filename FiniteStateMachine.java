
import java.util.Scanner;

public class FiniteStateMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MuR = sc.nextInt();
        int DnD = sc.nextInt();

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        if (a == '1') {
            if (MuR == 0) {
                MuR = 1;
                DnD = 0;
            } else {
                MuR = 0;
            }
        }
        if (b == '1') {
            if (DnD == 0) {
                DnD = 1;
                MuR = 0;
            } else {
                DnD = 0;
            }
        }
        if (MuR == 0 && DnD == 0) {
            System.out.println("NEUTRAL");
        } else if (MuR == 1 && DnD == 0) {
            System.out.println("MuR");
        } else if (MuR == 0 && DnD == 1) {
            System.out.println("DnD");
        }
    }
}
