
import java.util.*;

public class MrJohnWick {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Day = scan.nextLine().trim();
        if (Day.isEmpty()) {
            System.out.println("Input is invalid");
            return;
        }
            switch (Day) {
                case "Monday":
                case "Mon":
                    System.out.println("Fortune : Purple");
                    System.out.println("Unfortunate : Red");
                    break;
                case "Tuesday":
                case "Tue":
                    System.out.println("Fortune : Orange");
                    System.out.println("Unfortunate : Yellow, White");
                    break;
                case "Wednesday":
                case "Wed":
                    System.out.println("Fortune : Black, Brown, Gray");
                    System.out.println("Unfortunate : Pink");
                    break;
                case "Thursday":
                case "Thu":
                    System.out.println("Fortune : Red");
                    System.out.println("Unfortunate : Purple");
                    break;
                case "Friday":
                case "Fri":
                    System.out.println("Fortune : Pink");
                    System.out.println("Unfortunate : Black, Blue, Gray");
                    break;
                case "Saturday":
                case "Sat":
                    System.out.println("Fortune : Blue, Baby Blue");
                    System.out.println("Unfortunate : Green");
                    break;
                case "Sunday":
                case "Sun":
                    System.out.println("Fortune : Green");
                    System.out.println("Unfortunate : Blue, Baby Blue");
                    break;
                default:
                    System.out.println("Input is invalid");
                    break;
            }
        }
    }