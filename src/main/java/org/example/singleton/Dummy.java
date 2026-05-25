package org.example.singleton;

/**
 * This is singleton design pattern class.
 * The concept is to create only 1 object of a class and re-use that object whenever needed.
 * 1. but also first we have to block its object creation using the constructor, so make the constructor PRIVATE.
 * 2. then create a static method that returns the new OBJECT for the class,
 * (because STATIC method doesn't need an object to be called) and that's the whole game.
 * 3. That static method we created is also called FACTORY METHOD (a method that returns the object of the class).
 */
public class Dummy {
    // PRIVATE FIELD TO STORE CLASS OBJECT, SO THAT NO ONE CAN USE THIS OUTSIDE THE CLASS.
    private static Dummy dummy;

    // PRIVATE CONSTRUCTOR
    private Dummy() {
    }

    // STATIC METHOD TO GET OBJECT OF THIS CLASS (FACTORY METHOD).
    public static Dummy createDummy() {
        if (dummy == null) dummy = new Dummy();
        return dummy;
    }
}
