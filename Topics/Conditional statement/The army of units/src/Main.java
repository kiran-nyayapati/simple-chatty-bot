import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int armyOfUnits = scanner.nextInt();
        
        if (armyOfUnits < 1) {
            System.out.print("no army");
        } else if (armyOfUnits >= 1 && armyOfUnits <= 19) {
            System.out.print("pack");
        } else if (armyOfUnits >= 20 && armyOfUnits <= 249) {
            System.out.print("throng");
        } else if (armyOfUnits >= 250 && armyOfUnits <= 999) {
            System.out.print("zounds");
        } else {
            System.out.print("legion");
        }
    }
}
