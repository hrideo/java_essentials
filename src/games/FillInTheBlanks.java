package games;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter adjective");
        String adjective = scanner.next();

        System.out.println("Enter season of the year");
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int number  = scanner.nextInt();

        scanner.close();

        System.out.println("On a "+ adjective + " " + season +
                " day, I drink a minimum of " + number + " cup of coffee.");
    }
}
