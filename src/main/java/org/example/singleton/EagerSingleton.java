package org.example.singleton;

/**
 * This is Eager Singleton, it creates the objects when the class is loaded.
 * so when the program starts the object is created whether it is used or not.
 * 1. Create an object field that has the class object initialized already.
 * 2. Create Private CONSTRUCTOR of the class so that no one else can create an object through the constructor.
 * 3. Then create a FACTORY METHOD that just returns the object field that we created on our first step.
 * The class object is created when the class is loaded by the JVM.
 * so basically its waste of memory if the class is not used, and can slow up a startup if the class is heavy task.
 */
public class EagerSingleton {
    // PRIVATE FIELD TO STORE CLASS OBJECT, SO THAT NO ONE CAN USE THIS OUTSIDE THE CLASS.
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    // PRIVATE CONSTRUCTOR, SO THAT NO ONE CAN CREATE ANOTHER OBJECT (DEFIES THE MEANING OF THE DESIGN PATTERN.)
    private EagerSingleton() {
    }

    // STATIC METHOD TO GET OBJECT OF THIS CLASS (FACTORY METHOD).
    // SO THAT THE CLIENTS GETS THE OBJECT THAT IS ALREADY CREATED WHEN THE CLASS WAS LOADED.
    public static EagerSingleton createEagerSingleton() {
        return eagerSingleton;
    }
}
