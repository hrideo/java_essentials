package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String[] args) {
        //get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        //check if user is qualified
        isUserQualified(actualSalary, actualCreditScore);
    }

    public static void isUserQualified(double salary, int creditScore){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(salary >= requiredSalary && creditScore >= requiredCreditScore){
            System.out.println("Congrats, you have been approved");
        }
        else{
            System.out.println("Sorry, you are not qualified");
        }
    }
}
