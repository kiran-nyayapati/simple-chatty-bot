import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        if (k <= m * n && (k % n == 0 || k % m == 0)) { 
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
