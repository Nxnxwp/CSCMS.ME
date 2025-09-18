
import java.util.*;

public class Trainbomb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cart = sc.nextInt();
        int bomb = sc.nextInt();
        boolean Die = false;

        if (cart == 1) {
            System.out.println("DIE");
        }

        if (cart <= 3 && bomb == 2) {
            System.out.println("DIE");
            // return;
        }
        for (int i = 1; i <= cart; i++) {
            if (i == bomb || i == bomb - 1 || i == bomb + 1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
// From Xiangxiang
// import java.util.Scanner;

// public class Bombcart {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int traincart = scan.nextInt();
//         int bomb = scan.nextInt();

//         boolean safe = false;

//         //bomb = position's bomb -> bomb - 1 , bomb + 1 = Destroyed
//         if (traincart >= 1 && traincart <= 2000000000) {
//             for (int i = 1; i<=traincart; i++) {
//                 if ( i != bomb  && i != bomb -1 && i != bomb+1) {
//                     safe = true;
//                     System.out.print(i + " ");
//                 }
//             }
//             if (!safe) {
//                 System.out.println("DIE");
//             }
//         }
//     }
// }
