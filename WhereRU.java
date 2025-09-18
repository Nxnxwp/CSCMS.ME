import java.util.*;

class WhereRU {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Text = scan.nextLine().toLowerCase();
        char ch = scan.next().toLowerCase().charAt(0);
        int count = 0;
        String a = "";
        for (int i = 0; i < Text.length(); i++) {
            char b = Text.charAt(i);
            if (b == ch) {
                if (!a.isEmpty()) {
                    a += ", ";
                }
                a += i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("ERROR");
        } else {
            System.out.println(count);
            System.out.println(a);
        }
    }
}