import java.util.Scanner;

public class MarksCalArray {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int marks[] = new int[5];
        int total = 0;
        double avg;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scan.nextInt();
        }

        System.out.println("\nStudent\tMarks\tGrade");
        System.out.println("--------------------------");

        for (int i = 0; i < 5; i++) {

            String grade;

            if (marks[i] >= 75) {
                grade = "A";
            } 
            else if (marks[i] >= 65) {
                grade = "B";
            } 
            else if (marks[i] >= 55) {
                grade = "C";
            } 
            else if (marks[i] >= 45) {
                grade = "S";
            } 
            else {
                grade = "W";
            }

            total += marks[i];

            System.out.println((i + 1) + "\t" + marks[i] + "\t" + grade);
        }

        avg = total / 5.0;

        System.out.println("--------------------------");
        System.out.println("Total Marks   = " + total);
        System.out.println("Average Marks = " + avg);

    }
}