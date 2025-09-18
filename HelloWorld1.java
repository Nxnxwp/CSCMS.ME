
import java.util.Scanner;


public class HelloWorld1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name ? ");
        String name = sc.nextLine();
        System.out.print("Hello, " + name + ".");
    }
}

// public static String Greet(String name) {
//     return "Hello, "+ name +".";
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String name = sc.nextLine();
//     String message = Greet(name);
//     System.out.println(message);
