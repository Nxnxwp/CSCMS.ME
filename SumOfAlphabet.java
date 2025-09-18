
import java.util.Scanner;

public class SumOfAlphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int sum = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if (Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                int value = ch - 'a' + 1;
                sum += value - i;
            }
        }
        System.out.println(sum);
    }
}