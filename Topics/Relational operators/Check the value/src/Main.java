import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        boolean result = num > 0 && num < 10;
        
        System.out.print(result);
    }
}
