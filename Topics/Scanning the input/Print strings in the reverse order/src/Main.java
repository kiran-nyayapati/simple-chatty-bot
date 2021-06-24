// put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String[] readThreeStrings = new String[3];
        
        // Read the input and store it into the readThreeStrings array
        for (int i = 0; i < readThreeStrings.length; i++) {
            readThreeStrings[i] = scanner.next();
        }
        
        // Loop from End of the readThreeStrings array to the start & print its content
        for (int i = readThreeStrings.length - 1; i >= 0; i--) {
            System.out.println(readThreeStrings[i]);
        }
    }
}
