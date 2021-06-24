import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        if (userInput > -15 && userInput <= 12 || userInput > 14 && userInput < 17 || userInput >= 19) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }       
        /*
          (−15,12]∪(14,17)∪[19,+∞)
          U stand for "OR"
          -15 < i <= 12
          14 < i < 17
          19 <= i
        */
    }
}
