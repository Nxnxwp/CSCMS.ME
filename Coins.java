
import java.util.Arrays;
import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split("\\s+");
        int n = parts.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(arr); // sort
        int median = arr[n / 2]; // pick median
        long moves = 0;

        // for (int x : arr) {
        // moves += Math.abs(x - median);
        // }

        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            moves += Math.abs(x - median);
        }
        System.out.println(moves);
    }
}
