import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt(); // input = 976
        int firstDigit = inputNumber % 10; // 6
        int secondDigit = (inputNumber / 10) % 10; // 97.6 = 97 & then 7
        int thirdDigit = inputNumber / 100; // 9.76 = 9

        int reversedDigit = firstDigit * 100 + secondDigit * 10 + thirdDigit;
        System.out.println(reversedDigit);
    }
}

