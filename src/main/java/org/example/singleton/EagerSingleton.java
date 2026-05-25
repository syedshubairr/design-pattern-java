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
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton createEagerSingleton() {
        return eagerSingleton;
    }
}
