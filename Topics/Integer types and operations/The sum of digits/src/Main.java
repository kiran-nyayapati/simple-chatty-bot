import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputNumber = scanner.nextInt(); // input = 476
        
        int firstDigit = inputNumber / 100; // 4.76 = 4
        int secondDigit = (inputNumber / 10) % 10; // 47.6 = 47 & then 7
        int thirdDigit = inputNumber % 10; // 6

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        
        System.out.print(sumOfDigits);
    }
}
