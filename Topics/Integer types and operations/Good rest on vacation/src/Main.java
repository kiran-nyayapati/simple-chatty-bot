import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int durationInDays = scanner.nextInt();
        int totalFoodCost = scanner.nextInt() * durationInDays;
        int returnFlightCost = scanner.nextInt() * 2;     
        int hotelRate = scanner.nextInt() * (durationInDays - 1);
        
        int totalSumRequired = totalFoodCost + returnFlightCost + hotelRate;
        
        System.out.print(totalSumRequired);
    }
}
