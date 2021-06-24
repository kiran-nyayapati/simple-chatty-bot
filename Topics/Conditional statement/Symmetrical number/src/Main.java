import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int fourDigitNumber = scanner.nextInt(); // 2002
        
        int firstDigit = fourDigitNumber / 1000; // 2.002 = 2
        int secondDigit = (fourDigitNumber / 100) % 10; // 20.02 = 20 & 20 % 10 = 0
        int thirdDigit = (fourDigitNumber / 10) % 10; // 200.2 = 200 & 200 % 10 = 0
        int fourthDigit = fourDigitNumber % 10; // 2002 % 10 = 2
        
        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.print(1);
        } else {
            System.out.print(-1);
        }
    }
}
