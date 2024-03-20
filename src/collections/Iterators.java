/*
Iterators: are a way to loop through elements of a collection.
-The collection interface provides iterator
-The iterator method is provided by the collection interface, so it is available on all collections that inherit from collection, ie. set, list, queue.
-Map does not inherit from the collection interface and therefore does not have the iterator method.
 */
package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Iterators {

    public static void main(String[] args){

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

//Set is an unordered collection, so there are no methods on Set that will allow us to get item by its index
//But we can loop through the Set by calling the iterator method on the collection.
        var i = fruits.iterator();
//To use the iterator to access all elements of the collection, we'll need a loop
//hasNext method will return true if there are more items to process and false if it has reached the end of the collection
        while(i.hasNext()){
            //calling the next method on the iterator, as its name implies, this method returns the next element in the collection.
            //here we're simply printing it out, but we can do any type of processing on elements
            System.out.println(i.next());
        }

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
//Map provides the entry set method, which returns the map elements as a set.
        Set mapEntries = fruitCalories.entrySet();
// Using this set, we can then use the iterator method to loop through the elements.
        var i2 = mapEntries.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
    }
}
