
import java.util.Scanner;

public class RasingBacteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextInt();
        int count = 0;

        while(num > 0){
            if(num % 2 == 1){
                count++;
            }
            num /= 2;
        }
        System.out.println(count);
    }
}