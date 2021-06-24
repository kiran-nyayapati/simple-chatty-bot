import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int aSleepHours = scanner.nextInt();
        int bSleepHours = scanner.nextInt();
        int annSleepHours = scanner.nextInt();
        
        if (annSleepHours < aSleepHours) {
            System.out.print("Deficiency");
        } else if (annSleepHours > bSleepHours) {
            System.out.print("Excess");
        } else {
            System.out.print("Normal");
        }
    }
}
