import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numsubjects = scanner.nextInt();

        double totalScore = 0;

        for (int i =1; i <= numsubjects; i++) {
            System.out.println("Enter the score for subject " + i + ":");
            double score = scanner.nextDouble();
            totalScore += score;
        }

        
        double averageScore = totalScore / numsubjects;

        System.out.println("Average score: " + averageScore);

        if (averageScore >= 33) {
            System.out.println("Final Grade: Pass");
        } else {
            System.out.println("Final Grade: Fail");
        }
    }
}