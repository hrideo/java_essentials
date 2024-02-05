package decision_structures;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        //Initialize known values
        int salary =  1000;
        int bonus = 250;
        int quota = 10;

        //Get values for unknown
        System.out.println("How many sales did employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee pay is $" + salary);
    }
}
