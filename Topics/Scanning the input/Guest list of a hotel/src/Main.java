// put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] guestList = new String[8];
        
        // Read the input and store it into the guest array
        for (int i = 0; i < guestList.length; i++) {
            guestList[i] = scanner.next();
        }
        
        // Loop from End of the guestList array to the start & print its content
        for (int i = guestList.length - 1; i >= 0; i--) {
            System.out.println(guestList[i]);
        }
    }
}
/*
just remember, they got 4 rooms and based on that the total guests they can take is 1+2x2+3,
so if you are using loop and array this is your length
*/
