
import java.util.*;

public class Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int Ans = (n / 60) / 24 / 365;
        int Ans1 = (n / 60) / 24 % 365;
            System.out.println(Ans + " " + Ans1);
        }
    }