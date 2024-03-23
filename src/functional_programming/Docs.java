/*
Functional programming: is a software development style that uses mathematical functions to transform input into output.

Java, while primarily object-oriented, supports functional programming through the `java.util.function` package.
This package contains functional interfaces, which are interfaces with a single abstract method. These methods can be implemented using lambda expressions or method references.

Note that for the abstract method signature, T stands for the type of the input, R stands for the type of the return, and U stands for the type of the second argument if there is one.
Core functional interfaces include:
Consumer<T>: This interface accepts a single input of type T and returns no result. Its abstract method is void accept(T t).
Supplier<T>: This interface does not take any input but returns a value of type T. Its abstract method is T get().
Predicate<T>: This interface takes one argument of type T and returns a boolean value. Its abstract method is boolean test(T t).
Function<T, R>: This interface accepts one argument of type T and produces a result of type R. Its abstract method is R apply(T t).
UnaryOperator<T>: This is a special kind of Function that takes one argument of type T and returns a result of the same type. It extends Function<T, T>.
BinaryOperator<T>: This is another special kind of Function that takes two arguments of type T and returns a result of the same type. It extends BiFunction<T, T, T>.

Functional interfaces can also have default and static methods. For example, the `Function` interface has a default method `andThen` that allows chaining operations.
We can create custom functional interfaces, but it's recommended to annotate them with `@FunctionalInterface` to enforce the single abstract method rule. This allows Java to be used for both object-oriented and functional programming.

 */
package functional_programming;

public class Docs {
}
