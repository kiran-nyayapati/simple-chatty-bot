import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             
        int[] userInput = new int[4];       
        
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
            userInput[i] = --userInput[i];
        }
        
        for (int input : userInput) {
            System.out.print(input + " ");
        }
    }
}
