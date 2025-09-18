
import java.util.Scanner;

public class HelloCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        int len = arr.length;
        
        for(int i = 0; i < len; i++){
             arr[i] = sc.next();
        }
        for(int i = 0; i < len; i++){
            if(i % 2 == 1){
                StringBuilder sb = new StringBuilder(arr[i]);
                System.out.print(sb.reverse() + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
