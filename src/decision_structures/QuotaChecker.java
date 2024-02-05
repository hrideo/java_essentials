package decision_structures;

import java.util.Scanner;

public class QuotaChecker {

    public static void main(String[] args) {
        //Initialize known values
        int quota = 10;

        //Get values for unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Decision structure: Bonus earners
        if(sales >= quota){
            System.out.println("Congrats you have met your  quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota. You were " + salesShort + " sales short.");
        }

    }
}
