import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        int[] userInput = new int[2];
        
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }
        
        for (int i = userInput.length - 1; i >= 0; i--) {
            System.out.print(userInput[i] + " ");
        }
        // System.out.print("\b");
    }
}
