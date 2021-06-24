import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        boolean checkNum1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean checkNum2 = num1 <= 0 && num2 > 0 && num3 <= 0;
        boolean checkNum3 = num1 <= 0 && num2 <= 0 && num3 > 0;
        
        boolean checkNum = checkNum1 || checkNum2 || checkNum3;
        
        System.out.print(checkNum);
    }
}
