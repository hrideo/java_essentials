/*
Stream API provides several useful operations that can be performed on streams.
-These operations can be either:
    1. Intermediate operations return the resulting stream after performing an operation. This enables us to continue to perform more operations on the stream if desired.
    2. Terminal operations close the stream and return a result of the operation. This result can either be void or be a value. After a terminal operation, no more operations can be performed on the stream.
-The stream API is very convenient and provides a number of operations that allow us to process data. What's really powerful is the ability to chain together multiple intermediate operations, which are all performed with one pass through the data.


The anyMatch operation looks through the stream to determine if any of the elements match a given condition.
-The condition is passed into the anyMatch method in the form of a predicate.
-Because it returns Boolean value and not a resulting stream, anyMatch is a terminal operation and the stream is now closed.

The allMatch operation determines if every element in the stream matches a certain condition.
-Like anyMatch, the all match operation also takes a predicate.
-AllMatch is terminal, so the stream is now closed.

Filter is an intermediate operation, so it returns the resulting stream.
-To narrow the stream down to only elements that meet a certain condition, we can use the filter operation.

ForEach is a terminal operation, so after that call, the stream is closed.

There are also stream operations that allow us to manipulate the data. One such operation is map which accepts a function.

The reduce operation is used to combine the sequence of elements into a single value.
-It's commonly used when dealing with numbers

The collect operation takes the resulting stream and returns a data structure of our choice.
-Collect is a terminal operation.
 */
package functional_programming;

public class CommonStreamOperations {
}
