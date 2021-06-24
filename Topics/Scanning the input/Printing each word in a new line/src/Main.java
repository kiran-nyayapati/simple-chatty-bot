import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] userWords = new String[5];
        
        // Read the input and store it into the userWords array
        for (int i = 0; i < userWords.length; i++) {
            userWords[i] = scanner.next();
        }
        
        // Loop from start of userWords array to the end & print its content in order
        for (String word : userWords) {
            System.out.println(word);
        }
    }
}
