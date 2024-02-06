package gross_calculator;

import java.util.Scanner;

public class GrossPayInputValidator {

    public static void main(String[] args) {

        //initialize known variables
        int payRate = 15;
        int maxHours = 40;

        //get input for unknown variables
        System.out.println("How many hours employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. your hours mut be between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
