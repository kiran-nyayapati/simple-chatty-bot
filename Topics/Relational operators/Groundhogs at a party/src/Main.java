import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean groundhogParty = numberOfPeanutButterCups >= 10 && numberOfPeanutButterCups <= 20 && !isWeekend;
        boolean groundhogPartyInWeekend = numberOfPeanutButterCups >= 15 && numberOfPeanutButterCups <= 25 && isWeekend;

        boolean isPartySuccessful = groundhogParty || groundhogPartyInWeekend;

        System.out.print(isPartySuccessful);
    }
}
