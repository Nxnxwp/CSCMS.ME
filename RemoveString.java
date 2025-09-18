
import java.util.*;

public class RemoveString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println(str1.replaceAll(str2, "")); // or can use System.out.println(str1.replace(str2, ""))
        } else {
            System.out.println(str2.replaceAll(str1, ""));
        }
    }
}
