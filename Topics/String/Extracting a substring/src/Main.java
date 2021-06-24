import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.next();
        
        int startOfIndex = scanner.nextInt();
        int endOfIndex = scanner.nextInt();
        
        String subStr = word.substring(startOfIndex, endOfIndex + 1);
        
        System.out.print(subStr);
    }
}
