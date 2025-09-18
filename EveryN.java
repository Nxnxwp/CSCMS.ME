
import java.util.Scanner;

public class EveryN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = sc.nextInt();

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            if( i % n == 0){
                result.append(a.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}