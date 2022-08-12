/*

Inheritance

super

Function Overriding


*/

class Animal
{
    // fields
    String name;
    
    // methods
    public void run()
    {
        System.out.println("Animal running");
    }

    public void eat()
    {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println(name + " is barking");
    }

    public void printName()
    {
        System.out.println("My name is " + name);
    }

    public void eat()
    {
        super.eat();
        System.out.println(name + " eating Dog food");
    }
}



public class Inheritance {

    public static void main(String[] args) {
        
        Dog pug = new Dog();
        pug.name = "Tomy";
        pug.printName();
        pug.run();
        pug.bark();
        pug.eat();
    }
}