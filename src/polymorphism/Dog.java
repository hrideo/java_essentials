package polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("woof");
    }

    public void fetch(){
        System.out.println("I am dog and I like to fetch");
    }
}
