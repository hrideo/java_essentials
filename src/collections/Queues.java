/*
Queue: is a collection that is designed to hold items that need to be processed.
-The most common implementations of queue are linked lists and priority queue
-Queue an ordered collection
-Queues also allow duplicates
-they typically follow the (FIFO)first in first out algorithm, which means elements are processed in the order in which they are entered.
-first element of the queue is known as the head.
-last element of the queue is known as the tail.
 */
package collections;

import java.util.Queue;
import java.util.LinkedList;

public class Queues {

    public static void main(String[] args){

        Queue fruits = new LinkedList();
//add method is used to add elements to the queue
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);

//remove methods is used to remove element, and it also returns the element that was removed from the queue. (this is so that we can process it.)
//if we call remove method, we don't have to specify which object to remove. It will remove the first one in the queue ie. Head
        var removed = fruits.remove();
        System.out.println("removed: " + removed);
        System.out.println(fruits);

//the peek method returns the head of the queue without actually removing it.
        System.out.println("head of queue: " + fruits.peek());
    }
}
