
import java.util.Scanner;

public class PatternKMUTT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String star = "*";
        String dash = "-";

        for(int i = 0; i < input; i++){
            System.out.println(dash.repeat(input) + star + dash.repeat((input * 3) + 1 - (input + 1)));
        }
        System.out.println(star.repeat(input * 2 +1) + dash.repeat(input));
        for(int j = 1; j <= input - 1; j++){
            System.out.println(dash.repeat(input) + star + dash.repeat(input - 1) + star + dash.repeat(input));
        }
        System.out.println(dash.repeat(input) + star.repeat(input * 3 + 1 - input));
        for(int i = 0; i < input; i++){
            System.out.println(dash.repeat(input * 2) + star + dash.repeat(input));
        }
    }
}