import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sideOne = scanner.nextInt();
        int sideTwo = scanner.nextInt();
        int sideThree = scanner.nextInt();
        
        if (sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne && sideOne + sideThree > sideTwo) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
