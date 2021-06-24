import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int studentGroup1 = (int) (Math.ceil((double) scanner.nextInt() / 2));
        int studentGroup2 = (int) (Math.ceil((double) scanner.nextInt() / 2));
        int studentGroup3 = (int) (Math.ceil((double) scanner.nextInt() / 2));
        
        int minimumNumberOfDesks = studentGroup1 + studentGroup2 + studentGroup3;
        
        System.out.print(minimumNumberOfDesks);
    }
}
