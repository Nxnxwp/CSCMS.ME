import java.util.Arrays;
import java.util.Scanner;

// 1. Create a class to store the Monster's data
class Monster implements Comparable<Monster> {
    int id;       // The original index (1, 2, 3...)
    int distance; // The distance from input

    public Monster(int id, int distance) {
        this.id = id;
        this.distance = distance;
    }

    // 2. Define the sorting logic
    @Override
    public int compareTo(Monster other) {
        // First, check the distance
        if (this.distance != other.distance) {
            return this.distance - other.distance; // Ascending order of distance
        } 
        // If distances are equal, check the ID
        else {
            return this.id - other.id; // Ascending order of ID (Index)
        }
    }
}

public class PopGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt(); // Read number of monsters
            Monster[] monsters = new Monster[n];
            
            for (int i = 0; i < n; i++) {
                int dist = sc.nextInt();
                // Store index as i + 1 because the problem uses 1-based indexing
                monsters[i] = new Monster(i + 1, dist);
            }
            
            // 3. Sort the array using our custom logic defined in compareTo
            Arrays.sort(monsters);
            
            // 4. Print the IDs in the new order
            for (int i = 0; i < n; i++) {
                System.out.print(monsters[i].id + " ");
            }
        }
        sc.close();
    }
}
