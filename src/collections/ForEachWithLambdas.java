/*
A lambda expression is a short block of code that, just like a method, accepts parameters and returns a value. They differ from methods in that they do not have names, and they're executed in-line versus being called by other methods.


forEach method is an even more straightforward approach to iterating over collections.
-forEach method is available on every collection and Map.
-forEach is the most modern approach to iterating over Java collections.
-There's no need to define a loop.
-Inside the parenthesis of the forEach method, we provide the actions that we want performed for every element of this collection.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas {

    public static void main(String[] args) {
        printCollection_forEach();
        printMap_forEach();
    }

    public static void printCollection_forEach(){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

//On our collection, we call the forEach method.
//1. One way to express the action to perform is with a lambda expression.
//    The first step is to provide a name for the current elements, we call ours "f". (The names will not be referenced outside of the lambda expression. these are usually short one-letter names)
//    The next step is to indicate that we're going to specify the action. To do this we type -> arrow
//    Finally, we provide the action to perform.
        fruits.forEach(f -> System.out.println(f));

//2. When the action to perform is a single method call, we can simplify this even further with a "method reference".
//    So as opposed to declaring the element as input and output, it's assumed.
//    So we'll say className.forEach(className::methodName)
//    This reads as call this method and pass in the current element we're on.
        fruits.forEach(System.out::println);

//3. We can apply multiple statements to each element of the collection with forEach.
//    here we do just like performing single action, but then to enclose multiple statements, we add a set of curly braces.
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });
    }

    public static void printMap_forEach(){
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

//As Map have both a key and a value pair. So the lambda expression requires two inputs.
//Within the forEach method, we can define variables for both the key and the value within an additional set of parentheses.
//We do it in form of below,
        fruitCalories.forEach((k,v) -> System.out.println(k + " : " + v));
        //here k is for key and v is for value
    }


}