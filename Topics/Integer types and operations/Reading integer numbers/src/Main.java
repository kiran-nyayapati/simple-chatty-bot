import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] readIntNumbers = new int[4];

        for (int i = 0; i < readIntNumbers.length; i++) {
            readIntNumbers[i] = scanner.nextInt();
        }

        for (int number : readIntNumbers) {
            System.out.println(number);
        }
    }
}
