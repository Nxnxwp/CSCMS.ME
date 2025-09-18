import java.util.Scanner;

public class Isogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String re = text.replace(" ", "").toLowerCase();
        boolean is = true;

            for (int i = 0; i < re.length() - 1; i++) {
                char ch = re.charAt(i);

                for (int j = i + 1; j < re.length(); j++) {
                    char ch2 = re.charAt(j);

                    if (ch == ch2) {
                        is = false;
                    }
                }
                if (!is) {
                    break;
                }
            }
        if (is) {
            System.out.println(text + " is an isogram");
        } else {
            System.out.println(text + " is not an isogram");
        }
    }
}
