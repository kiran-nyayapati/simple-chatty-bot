import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long startInteger = scanner.nextInt();
        long endInteger = scanner.nextInt();
        long product = 1;
        
        for (long i = startInteger; i < endInteger; i++) {
            product *= i;                 
        }
        System.out.println(product);
    }
}
