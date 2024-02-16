/*
Variable arguments: also referred as varargs
- allow us to be more flexible with the arguments we send in
- method parameter that accepts an arbitrary number of values
- after data type, three dots then variable name

- a method can have additional parameters, but only one of those parameter is allowed to be vararg parameter
- in such case, vararg parameter must be last
 */
package arrays;

public class SumCalculator {

    //a is vararg, it means we can pass zero or more variables into the method
    public static void calculateSum(int ...a) {
        int sum = 0;
        //treat vararg a like array
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        calculateSum();
        calculateSum(2, 4);
        calculateSum(2, 4,6, 8, 10);
        calculateSum(new int[]{3,4,6,7});
    }
}
