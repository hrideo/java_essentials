/*
Set: is an unordered collection of unique objects.
-Because set is an interface, it cannot be instantiated, but it can be an object's type.
 */
package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main (String[] args){

//Some implementations of Set are:
//  -hash set
//  -linked hash sets
//  -tree sets
        Set fruits = new HashSet();
//add method used to add item to a set
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
//if we add another apple, notice we don't get error, however the duplicate item will simply not be stored.
        fruits.add("apple");


        System.out.println(fruits);
//to detect whether a given collection contains a specific element, we use the contains method
        System.out.println("Has lemon?: " + fruits.contains("cherry"));


//remove method allows us to delete element from collection
        fruits.remove("cherry");
//size method returns the number of elements in the collection
        System.out.println("Number of elements after removing cherry: " + fruits.size());


//the static method of , allows us to add objects to set, by entering objects in a comma delimited list
        Set moreFruits = Set.of("pear", "raisin", "lemon");
        System.out.println(moreFruits);

//the of method does come with a cost- the collection becomes immutable meaning it cannot change
//thus following method gives error
        moreFruits.add("cranberry");
        moreFruits.remove("lemon");
    }
}
