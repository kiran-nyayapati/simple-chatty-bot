import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the preliminary data
        String firstName = scanner.next();
         
        // Skip the next three inputs
        scanner.nextInt();
        scanner.next();
        scanner.nextInt();
        
        String cuisinePreference = scanner.next();
        
        System.out.print("The form for " + firstName + " is completed. ");
        System.out.print("We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}
