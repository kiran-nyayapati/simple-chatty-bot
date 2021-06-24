import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt(); // input = 173      
        int tensDigit = (inputNumber / 10) % 10; // 17.3 = 17 & then 7
       
        System.out.print(tensDigit);
    }
}
