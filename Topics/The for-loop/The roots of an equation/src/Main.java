import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int input4 = scanner.nextInt();

        for (int integerRoots = 0; integerRoots <= 1000; integerRoots++) {
            int rootOfACubicEquation = input1 * integerRoots * integerRoots * integerRoots +
                                       input2 * integerRoots * integerRoots +
                                       input3 * integerRoots +
                                       input4;
            if (rootOfACubicEquation == 0) {
                System.out.println(integerRoots);
            }
        }
    }
}
