import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstMomentInHours = scanner.nextInt() * 3600;
        int firstMomentInMinutes = scanner.nextInt() * 60;
        int firstMomentInSeconds = scanner.nextInt();
        
        int secondMomentInHours = scanner.nextInt() * 3600;
        int secondMomentInMinutes = scanner.nextInt() * 60;
        int secondMomentInSeconds = scanner.nextInt();
        
        int firstMomentInTime = firstMomentInHours + firstMomentInMinutes + firstMomentInSeconds;
        int secondMomentInTime = secondMomentInHours + secondMomentInMinutes + secondMomentInSeconds;
        
        int secondsPassedBetweenTwoMoments = secondMomentInTime - firstMomentInTime;
        
        System.out.print(secondsPassedBetweenTwoMoments);
    }
}
