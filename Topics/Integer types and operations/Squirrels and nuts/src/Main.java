import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfSquirrels = scanner.nextInt();
        int numberOfNuts = scanner.nextInt();

        int nutsLeftPerSquirrel = numberOfNuts % numberOfSquirrels;
        System.out.print(nutsLeftPerSquirrel);
    }
}
