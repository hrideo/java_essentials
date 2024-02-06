package loops;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 2;
        int numberOfTests = 3;

        Scanner scanner = new Scanner(System.in);

        //process all students
        for(int i=0; i<numberOfStudents; i++){

            double total = 0;

            //process all tests
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter score for test#" + (j+1));
                double score = scanner.nextDouble();

                total= total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The average score of student#" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}