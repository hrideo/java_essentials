package decision_structures;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        //Get test scores
        System.out.println("Enter your test scores: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Decision structure: determine letter grade
        char grade;
        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        //output
        System.out.println("Your grade is " + grade);
    }
}
