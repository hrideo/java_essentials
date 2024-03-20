/*
Collection is an object that holds references to other objects.
Collection are considered data structures and the objects within a collection are known as elements.

Elements within a Collection:
-Unique vs duplication
-Ordered vs unordered

Java provides a collections framework which consists of interfaces, classes and methods to store and manipulate these groups of objects.
All the interfaces and classes for the collections framework can be found in the java.util package.
Collection itself is an interface and is the root of the hierarchy.
Java does not provide any direct implementations but there are other interfaces which inherit from collection.
The most common ones are:
1.set:
    Collection of unordered unique elements.
    eg.deck of playing cards
2.list:
    Collection of ordered elements that can be accessed by position
    eg.phone numbers from call history
3.queue:
    Collection of ordered elements that are processed in the order they were added
    FIFO First in first out
    eg.people in checkout line at supermarket
4.map
    Collection of unordered unique key-value pairs
    eg.bank transactions: transaction id-transaction as key-value

In addition to collections themselves, Java also provides a collections class which contains common algorithms that are needed to work with the data structures
Common ones include- binarySearch, copy, frequency, reverse, shuffle, sort.

Ways to iterate over a collection:
-Iterator
-Enhanced for loop
-forEach method
 */
package collections;

public class Docs {
}
