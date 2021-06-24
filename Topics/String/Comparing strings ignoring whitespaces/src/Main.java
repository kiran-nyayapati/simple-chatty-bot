import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userInput1 = scanner.nextLine(); 
        String userInput2 = scanner.nextLine();
        
        String word = userInput1.replace(" ", "").trim();
        String newWord = userInput2.replace(" ", "").trim();
        
        System.out.print(word.equals(newWord)); // true
    }
}
