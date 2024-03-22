/*
Enhanced for loop is a special form of the for loop made just for looping through the elements of a collection
-the enhanced for loop works for every type of collection
-however, with maps we need to iterate over the entry set as opposed to directly over the map itself
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnhancedForLoops {

    public static void main(String[] args){
//When we defined our list, we didn't specify the data type of the elements we were adding. So by default, they are considered of type object. But when we're declaring fruit within our enhanced for loop, we're saying the elements are of type string. If we want to be more specific when declaring a collection, we can do so by specifying the data type of the elements this collection can hold. This is done inside a pair of angle brackets. So we can add string here and another set of empty angle brackets on the right side. Now we're okay to use the enhanced for loop.
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

//Inside the for loop parentheses, we declare current element we're working with. Every element in current list is a string. So we can write the word string and then give the elements a variable name.
//Next we add a colon and the name of the collection we're iterating through.
//This is read as "for the next fruit element in the fruits collection"
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

//Although, with maps you'll need to iterate over the entry set as opposed to directly over the map itself
        for(Map.Entry calorieInfo : fruitCalories.entrySet()){
            System.out.println(calorieInfo);
        }
    }
}
