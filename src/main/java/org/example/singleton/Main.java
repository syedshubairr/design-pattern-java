package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        // Get object using the static method.
        LazySingleton obj = LazySingleton.createLazySingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("Lazy Singleton Obj1: " + obj.hashCode());
        LazySingleton obj2 = LazySingleton.createLazySingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("Lazy Singleton Obj2: " + obj2.hashCode());

        EagerSingleton obj3 = EagerSingleton.createEagerSingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("Eager Singleton obj1: " + obj3.hashCode());
        EagerSingleton obj4 = EagerSingleton.createEagerSingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("Eager Singleton obj2: " + obj4.hashCode());
    }
}
