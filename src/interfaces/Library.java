package interfaces;

public class Library {

    public static void main(String[] args){

//just like abstract classes, we cannot instantiate interfaces
//we can instead use any class that implements interface
        Product book1 = new Book();
        book1.setName("Science handbook");
    }
}
