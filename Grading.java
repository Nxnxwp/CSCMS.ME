
import java.util.Scanner;

class Grading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 0 && score <= 49) {
            System.out.println("F");
        }
        if (score >= 50 && score <= 59) {
            System.out.println("D");
        }
        if (score >= 60 && score <= 79) {
            System.out.println("C");
        }
        if (score >= 80 && score <= 89) {
            System.out.println("B");
        }
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        }
    }
}
