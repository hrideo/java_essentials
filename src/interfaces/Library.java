package interfaces;

public class Library {

    public static void main(String[] args){

//just like abstract classes, we cannot instantiate interfaces
//we can instead use any class that implements interface
        Product book1 = new Book();
        book1.setName("Science handbook");

        Book book2 = new Book();
//default methods are now available to objects that are instantiated with any of the classes that implement interface
        book2.getPrice();
    }
}
