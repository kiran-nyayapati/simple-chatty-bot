import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int poleHeight = scanner.nextInt(); // h = 20
        int aFeetUp = scanner.nextInt(); // 7
        int bFeetDown = scanner.nextInt(); // 3
        
        int snailReachTopOfPoleInDays = (poleHeight - bFeetDown - 1) / (aFeetUp - bFeetDown) + 1;
        
        System.out.print(snailReachTopOfPoleInDays);   
    }
}
