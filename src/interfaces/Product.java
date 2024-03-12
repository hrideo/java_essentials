package interfaces;

public interface Product {

//but if fields are said to be final and then declared their value, the implementing class cannot change value,
// thus it is okay to omit the fields altogether and only provide methods

//here we can define methods with no bodies just like abstract classes except we don't have to write
// the abstract reserved word
    String getName();
    void setName(String name);

//default methods: are methods within an interface that allow us to provide default implementation
//-this enables to ensure backward compatibility in implementing classes, when changes/additions are made to interface
//-to indicate default method we write 'default' at beginning of method's header, and we give it body
//-they are not final and classes that implement interface can override default methods
//-if there is no good default implementation, it may be best to leave new method as abstract and then let class implement it
    default double getPrice(){ return 50; }
    default void setPrice(double price){}
}
