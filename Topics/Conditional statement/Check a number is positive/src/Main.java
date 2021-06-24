import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}

