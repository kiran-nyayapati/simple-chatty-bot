import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int startInteger = scanner.nextInt();
        int endInteger = scanner.nextInt();
        int sum = 0;
        
        for (int i = startInteger; i <= endInteger; i++) {
            sum += i;                 
        }
        System.out.println(sum);
    }
}
