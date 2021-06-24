import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] numberOfStudents = new int[size];
        
        for (int i = 0; i < size; i++) {
            numberOfStudents[i] = scanner.nextInt();
        }
        
        int gradeDCount = 0;
        int gradeCCount = 0;
        int gradeBCount = 0;
        int gradeACount = 0;
        
        for (int student : numberOfStudents) { 
            if (student == 2) {
                gradeDCount++;
            } else if (student == 3) {
                gradeCCount++;
            } else if (student == 4) {
                gradeBCount++;
            } else if (student == 5) {
                gradeACount++;
            }                
        }      
        System.out.format("%d %d %d %d", gradeDCount, gradeCCount, gradeBCount, gradeACount);
    }
}
