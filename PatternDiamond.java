
import java.util.*;

public class PatternDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            printChars(num - i, '-');
            printChars(2 * i - 1, '*');
            printChars(num - i, '-');
            System.out.println();
        }
        for(int i = 1; i <= num - 1; i++){
            printChars(i, '-');
            printChars(2 * (num - i) - 1, '*');
            printChars(i, '-');
            System.out.println();
        }
    }
    static void printChars(int count, char ch){
        for(int j = 0; j < count; j++){
            System.out.print(ch);
        }
    }
}
