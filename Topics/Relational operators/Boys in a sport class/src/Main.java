import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstHeigth = scanner.nextInt();
        int secondHeigth = scanner.nextInt();
        int thirdHeigth = scanner.nextInt();

        boolean checkAscending = firstHeigth >= secondHeigth && secondHeigth >= thirdHeigth;
        boolean checkDescending = firstHeigth <= secondHeigth && secondHeigth <= thirdHeigth;
        boolean checkEqualHeigth = firstHeigth == thirdHeigth;

        boolean heigth = checkAscending || checkDescending || checkEqualHeigth;

        System.out.print(heigth);
    }
}
