package interfaces;

public interface Product {

//but if fields are said to be final and then declared their value, the implementing class cannot change value,
// thus it is okay to omit the fields altogether and only provide methods

//here we can define methods with no bodies just like abstract classes except we don't have to write
// the abstract reserved word
    String getName();
    void setName(String name);
}
