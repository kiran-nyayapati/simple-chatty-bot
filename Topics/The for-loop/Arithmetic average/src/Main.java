import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int startInteger = sc.nextInt();
        int endInteger = sc.nextInt();
        int sum = 0;
        int divisibleBy3Count = 0;
        
        for (int i = startInteger; i <= endInteger; i++) {
            if (i % 3 == 0) {
                sum += i;
                divisibleBy3Count++;
            }                         
        }
        double average = (double) sum / divisibleBy3Count;     
        System.out.format("%.1f", average);
    }
}
