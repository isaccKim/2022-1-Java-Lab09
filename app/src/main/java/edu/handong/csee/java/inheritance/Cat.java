package edu.handong.csee.java.inheritance;


public class Cat extends Animal {
	
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    @Override
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod(); // hiding
        myCat.testInstanceMethod(); // overriding
       
        Animal myAnimal = myCat;  //polymorphism
        Animal.testClassMethod(); // hiding
        myAnimal.testInstanceMethod(); //overriding
        
        Animal myAnimal2 = new Dog(); //polymorphism
        Animal.testClassMethod(); // hiding
        myAnimal2.testInstanceMethod(); // overriding
        
        Animal myAnimal3 = new Monkey();  //polymorphism
        Animal.testClassMethod(); // hiding
        myAnimal3.testInstanceMethod(); // overriding
     
    }
}

