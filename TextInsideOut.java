
import java.util.Scanner;

public class TextInsideOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tex = sc.nextLine();
        int len = tex.length();
        int mid = len / 2;
        String result = "";


        if (len % 2 == 0) {
            for (int i = mid - 1; i >= 0; i--) {
                result += tex.charAt(i);
            }
            for(int i = len - 1; i >= mid; i--){
                result += tex.charAt(i);
            }
        } 
        else {
            for(int i = mid - 1; i >= 0; i--){
                result += tex.charAt(i);
            }
            result += tex.charAt(mid);
            for(int i = len - 1; i > mid; i--){
                result += tex.charAt(i);
            }
        }
        System.out.println(result);
    }
}
