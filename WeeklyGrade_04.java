import java.util.Scanner;
public class WeeklyGrade_04 {

    public static String[] generateNames(int count, String prefix) {
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            names[i] = prefix + " " + (i + 1);
        }
        return names;
    }

    static void inputGrades(int[][] grades, String[] students, String[] weeks, Scanner sc) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("\nInput grades for " + students[i] + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("  " + weeks[j] + ": ");
                grades[i][j] = sc.nextInt();
            }
        }
    }

    static void display(int [][] grades, String[] students, String[] weeks) {
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

    static void findWeekHighest(int[][] grades, String[] weeks) {
        int maxWeek = 0;
        int maxTotal = -1;

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

    static void findTopStudent(int[][] grades, String[] students, String[] weeks) {
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
        System.out.print("Input the number of students: ");
        int numStudents = sc.nextInt();

        System.out.print("Input the number of weeks: ");
        int numWeeks = sc.nextInt();
        
        int[][] grades = new int[numStudents][numWeeks];
        String[] students = generateNames(numStudents, "Student");
        String[] weeks = generateNames(numWeeks, "Week");

        System.out.println("\n--- Input Grades ---");
        inputGrades(grades, students, weeks, sc);
        
        System.out.println("\n=== All Students Grades ===");
        display(grades, students, weeks);

        System.out.println("\n=== Week with Highest Total Grade ===");
        findWeekHighest(grades, weeks);

        System.out.println("\n=== Student with Highest Total Grade ===");
        findTopStudent(grades, students, weeks);

        sc.close();
    }
}