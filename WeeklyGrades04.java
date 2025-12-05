import java.util.Scanner;

public class WeeklyGrades04 {
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static String[] weeks = {"Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7"};

    static void inputGrades(int[][] grades, Scanner sc) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("\nInput grades for " + students[i] + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("  " + weeks[j] + ": ");
                grades[i][j] = sc.nextInt();
            }
        }
    }

    static void display(int [][] grades) {
        System.out.printf("%-10s", "Name");
        for (int i = 0; i < weeks.length; i++) {
            System.out.printf("%-8s", weeks[i]);
        }
        System.out.println();

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%-10s", students[i]);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%-8d", grades[i][j]);
            }
            System.out.println();
        }
    }

    static void findWeekHighest(int[][] grades) {
        int maxWeek = 0;
        int maxTotal = 0;

        for (int w = 0; w < grades[0].length; w++) { 
            int total = 0;
            for (int s = 0; s < grades.length; s++) {
                total += grades[s][w];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxWeek = w;
            }
        }

        System.out.println("Highest grade total is in " + weeks[maxWeek] + " with total = " + maxTotal);
    }

    static void findTopStudent(int[][] grades) {
        int bestStudent = 0;
        int bestTotal = -1;
        for (int s = 0; s < grades.length; s++) { 
            int total = 0;
            for (int w = 0; w < grades[0].length; w++) {
                total += grades[s][w];
            }
            if (total > bestTotal) {
                bestTotal = total;
                bestStudent = s;
            }
        }

        System.out.println("Top Student: " + students[bestStudent]);
        System.out.println("Total Grade: " + bestTotal);
        System.out.println("Grade per week:");
        
        for (int w = 0; w < grades[0].length; w++) {
            System.out.println("  " + weeks[w] + ": " + grades[bestStudent][w]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int[][] grades = new int[5][7];  
        inputGrades(grades, sc); 

        System.out.println("\n=== All Students Grades ===");
        display(grades);

        System.out.println("\n=== Week with Highest Total Grade ===");
        findWeekHighest(grades);

        System.out.println("\n=== Student with Highest Total Grade ===");
        findTopStudent(grades);
        
        sc.close(); 
    }
}