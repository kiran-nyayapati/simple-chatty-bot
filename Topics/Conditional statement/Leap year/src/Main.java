import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenYear = scanner.nextInt();

        if (givenYear % 4 == 0 && givenYear % 100 != 0 || givenYear % 400 == 0) {
            System.out.print("Leap");
        } else {
            System.out.print("Regular");
        }
    }
}
