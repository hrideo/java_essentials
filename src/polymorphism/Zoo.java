/*
Type casting: is the implicit or explicit act of converting an object's type into a different type.
-casting can be performed upward or downward in an inheritance tree.
-Type casting should only be used when absolutely necessary
 */
package polymorphism;

public class Zoo {

    public static void main(String[] args){
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        //when we create an object with a type of superclass but instantiated with type of subclass, this
        // is an implicit up cast
        Animal sasha = new Dog();
        sasha.makeSound();

        //In an implicit up cast, the object now only has access to the methods of the class it was casted up to.
          // e.g. even though the object sasha is an instance of the Cat class, its type is Animal. So this object
          // cannot reference members that are specific to the Cat class, such as scratch.
        sasha = new Cat();
        sasha.makeSound();

        //In order for this object to access methods from the subclass, we need to explicitly down cast it to type Cat
        //To explicitly cast an object from one type to another, we need to write the name of subclass that we want
        // to change, inside a set of parentheses before object's name, then encompass class and object within another
        // set of parentheses.

        //this does not change overall object, sasha is still of type Animal, but in this specific call sasha will
        // be type of cat just so we can execute scratch method
        ((Cat)sasha).scratch();

        //this was just temporary, if we wanted to store a down casted object, we could do so by assigning the cast
        // to an object of that same type
        Cat sashaTheCat = (Cat)sasha;
        sashaTheCat.scratch();
    }
}
