
import java.util.Scanner;

public class Factor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        String result = "";

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                result += " ";
            }
        }
        System.out.println(result.length());
    }
}
