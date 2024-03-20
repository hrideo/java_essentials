/*
Map: is the one which maps unique keys to values.
-While the keys are required to be unique, the values are not
-we can use any type of object for either the key or value
-the elements are unordered, meaning they do not appear in the order that we added them.
-Popular implementations of the Map interface are HashMap, TreeMap and LinkedHashMap
-map is not technically a collection, because it doesn't inherit from the collection interface, but it's still considered part of the collection's framework.
 */
package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args){
        Map fruitCalories = new HashMap();
//Map has a put method which is used to add the elements. it takes two arguments: a key and a value
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
//If we call put passing in a key that already exists, the map will update that entry with the new value that was passed in.
        // fruitCalories.put("lemon", 17);
//we can call method putIfAbsent to prevent from unintentionally overriding something that's already in the map
        fruitCalories.putIfAbsent("lemon", 17);
        System.out.println(fruitCalories);

//we can access an element in the map by get method with key
        System.out.println("banana: " + fruitCalories.get("banana"));

////There is also a replace method that is designed specifically for replacing an entry. In the case of replace, if the element doesn't already exist, it is not added.
//we call the remove method, and we pass in the key of the element to remove an element from a map

//we can use the containsKey and containsValue methods to see if a map contains a certain key or a certain value
        System.out.println(fruitCalories.containsKey("strawberry"));
        System.out.println(fruitCalories.containsValue(95));

//Map also has a couple of methods that will return a set which inherits from the collection interface and therefore is a true collection.
//EntrySet will return the map elements as a set and keySet will return a set of just the keys as the map elements.
        Set mapEntries = fruitCalories.entrySet();
        Set mapKeys = fruitCalories.keySet();
//values method returns a collection of values.
        Collection values = fruitCalories.values();
        System.out.println(mapEntries);
        System.out.println(mapKeys);
        System.out.println(values);

//of method allows to create an immutable map of key value pairs in one statement. The arguments are key followed by value
        Map immutableFruitCalories = Map.of(
                "apple",95,
                "lemon",20);
        System.out.println(immutableFruitCalories);
    }
}
