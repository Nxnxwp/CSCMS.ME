import java.util.Arrays;
import java.util.Scanner;

public class grading2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] scores = new int[num];
        for(int i = 0; i < num; i++){
            scores[i] = sc.nextInt();
        }
        int[] origin = Arrays.copyOf(scores, num);

        Arrays.sort(scores);

        int P90 = Percentile(scores, num, 90);
        int P70 = Percentile(scores, num, 70);
        int P50 = Percentile(scores, num, 50);
        int P30 = Percentile(scores, num, 30);
        int P10 = Percentile(scores, num, 10);

        for(int s : origin){
            if (s >= P90) System.out.print("A" + " ");
            else if (s >= P70) System.out.print("B" + " ");
            else if (s >= P50) System.out.print("C" + " ");
            else if (s >= P30) System.out.print("D" + " ");
            else if (s >= P10) System.out.print("E" + " ");
            else System.out.print("F" + " ");
        }
        System.out.println();
    }
    private static int Percentile(int[] sortscores, int n ,int k){
        double pos = (k * (n + 1)) / 100.0;
        int index = (int) Math.ceil(pos) - 1;
        if(index == 0) index = 0;
        if(index >= n) index = n - 1;
        return sortscores[index];
    }
}
