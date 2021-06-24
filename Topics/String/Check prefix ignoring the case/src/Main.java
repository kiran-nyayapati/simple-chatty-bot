import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.nextLine();
        
        System.out.print(word.toUpperCase().charAt(0) == 'J');
        
    }
}
