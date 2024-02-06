package loops;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args){

        //get number of items to scan
        System.out.println("Enter number of items to scan: ");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;

        //loop to iterate through all items and accumulate costs
        for(int i=0; i<quantity; i++) {
            System.out.println("Enter the cost of item: ");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is " + total);
    }
}
