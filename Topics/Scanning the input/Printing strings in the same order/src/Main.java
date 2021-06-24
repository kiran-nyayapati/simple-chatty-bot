import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String[] readFourWords = new String[4];
        
        // Read the input and store it into the readFourWords array
        for (int i = 0; i < readFourWords.length; i++) {
            readFourWords[i] = scanner.next();
        }
        
        // Loop from start of readFourWords array to the end & print its content in order
        for (String word : readFourWords) {
            System.out.println(word);
        }
    }
}
