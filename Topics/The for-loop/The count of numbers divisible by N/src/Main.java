import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int startInteger = scanner.nextInt();
        int endInteger = scanner.nextInt();
        int divisibleByNumber = scanner.nextInt();
        int count = 0;
        
        for (int i = startInteger; i <= endInteger; i++) {
            if (i % divisibleByNumber == 0) {
                count++;
            }                         
        }
        System.out.format("%d", count);
    }
}
