package loops;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;
        do{
            System.out.println("Enter first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter second number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes and 2 for no");
            runAgain = scanner.nextInt();

        }while(runAgain == 1);

        scanner.close();
    }
}
