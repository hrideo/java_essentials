package gross_calculator;

public class GrossPayCalculator {

    public static void main(String[] args) {
        //1.Get number of hours worked
        int hours = 40;

        //2.Get the hourly pay
        double payRate = 25.5;

        //3.Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4.Display Result
        System.out.println("Gross pay: " + grossPay);
        
    }
}
