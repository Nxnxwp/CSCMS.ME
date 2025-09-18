
import java.util.Scanner;

public class PatternN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 3 || N > 200) System.out.println();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(j == 0 || j == N - 1 || j == i){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
