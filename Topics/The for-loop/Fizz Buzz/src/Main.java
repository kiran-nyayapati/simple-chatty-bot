import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int startInterval = scanner.nextInt();
        int endInterval = scanner.nextInt();
        
        for (; startInterval <= endInterval; startInterval++) {
            if (startInterval % 3 == 0 && startInterval % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (startInterval % 5 == 0) {
                System.out.println("Buzz");
            } else if (startInterval % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(startInterval);
            }
        }
    }
}
