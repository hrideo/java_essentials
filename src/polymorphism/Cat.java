package polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound(){
        System.out.println("meow");
    }

    public void scratch(){
        System.out.println("I am cat and I scratch things");
    }
}
