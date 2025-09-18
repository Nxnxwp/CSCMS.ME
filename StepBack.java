
import java.util.Scanner;

public class StepBack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int min = scan.nextInt();

        String a = "";
        if (max > min){
            for(int i = max; i >= min; i--){
                a += i + " ";
                System.out.print(a);
            }
        } else if (min > max) {
            for (int j = min; j >= max; j--){
                a += j + " ";
                System.out.print(a);
            }
        } else {
            System.out.print(max);
        }
    }
}
