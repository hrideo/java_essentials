/*
Inheritance: is where one class becomes an extension of another class, thus inheriting the members of extended class.

-Inheritance is useful for reusing code between related classes
-Inheritance involves parent and child.

-Parent is known as superclass or parent class or base class
-Child is Known as subclass or child class or derived class

-The reserved word 'extends' is used in child class for inheritance
-anything that's marked as private is not inherited.
-only protected and public fields and methods can be inherited
 */
package inheritance;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(){
        System.out.println("In Person default constructor");
    }

    public Person(String name){
        System.out.println("In Person 2nd constructor. Name is set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
