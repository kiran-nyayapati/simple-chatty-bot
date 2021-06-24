import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = scanner.nextInt();

        int firstDigit = firstNumber / 10;
        System.out.print(firstDigit);
    }
}
