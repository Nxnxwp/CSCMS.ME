
import java.util.Scanner;

class EncryptCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        String star = "*";
        String dash = "-";
        char[] arr = new char[word.length()];

        for(int i = 0; i < word.length(); i++){
            arr[i] = word.charAt(i);
        }
        for(int i = 0; i < word.length(); i++){ // loop check same char
            int count = 0; // use for counting same char
            for(int j = 0; j < word.length(); j++){
                if(i == j){
                    continue;
                } else{
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
            }
            if(count == 0){
                System.out.print(star);
            } else{
                System.out.print(dash);
            }
        }
        System.out.println();
    }
}