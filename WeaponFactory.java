import java.util.Scanner;

public class WeaponFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iron = sc.nextInt();
        int Sword = 0;
        int Shield = 0;
        int Helmet = 0;

        while (iron > 2) {
            if (iron >= 3 && iron < 8) {
                Helmet++;
                iron -= 3;
            }
            if (iron >= 8 && iron < 10) {
                Shield++;
                iron -= 8;
            }
            if (iron >= 10 && iron < 18) {
                Sword++;
                iron -= 10;
            }
            if (iron >= 18 && iron < 21) {
                Sword++;
                Shield++;
                iron -= 18;
            }
            if (iron >= 21) {
                Sword++;
                Shield++;
                Helmet++;
                iron -= 21;
            }

        }
        System.out.println(Sword + " " + Shield + " " + Helmet + " " + iron);
    }
}