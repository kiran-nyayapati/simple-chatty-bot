import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] numberOfElements = new int[size];
        
        for (int i = 0; i < size; i++) {
            numberOfElements[i] = scanner.nextInt();
        }
        
        int max = 0;
        for (int element : numberOfElements) {
            if (element % 4 == 0 && element > max) {
                max = element;
            }
        } 
        System.out.format("%d", max);          
    }
}
