import java.util.Scanner;

public class PeakFinding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Use StringBuilder for faster and cleaner string concatenation
        StringBuilder result = new StringBuilder();
        int count = 0;

        if (n == 1) {
            System.out.println("1");
            System.out.println(arr[0]);
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean isPeak = false;

            if (i == 0) {
                if (arr[i] >= arr[i + 1]) {
                    isPeak = true;
                }
            } else if (i == n - 1) {
                if (arr[i] >= arr[i - 1]) {
                    isPeak = true;
                }
            }
            // 3. Check Middle Elements
            else {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    isPeak = true;
                }
            }

            // If it is a peak, add to result
            if (isPeak) {
                count++;
                if (result.length() > 0) {
                    result.append(" "); // Add space only before new items
                }
                result.append(arr[i]);
            }
        }

        System.out.println(count);
        System.out.println(result.toString());
    }
}