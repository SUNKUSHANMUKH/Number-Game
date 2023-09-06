import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        // Get the number of subjects
        System.out.println("Enter the number of subjects: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = scanner.nextInt();

       
        int[] marks = new int[numberOfSubjects];

        
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        
        float averagePercentage = (float) totalMarks / numberOfSubjects * 100;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }

        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}