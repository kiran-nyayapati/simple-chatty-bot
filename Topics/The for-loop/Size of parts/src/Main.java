import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] numberOfParts = new int[size];
        
        for (int i = 0; i < size; i++) {
            numberOfParts[i] = scanner.nextInt();
        }
        
        int readyToShipCount = 0;
        int fixedCount = 0;
        int rejectCount = 0;
        
        for (int part : numberOfParts) {
            if (part == 0) {
                readyToShipCount++;
            } else if (part == 1) {
                fixedCount++;
            } else if (part == -1) {
                rejectCount++;
            }
        }
        
        System.out.format("%d %d %d", readyToShipCount, fixedCount, rejectCount);
    }
}
