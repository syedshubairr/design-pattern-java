package org.example.singleton.simple;

public class EagerMain {
    public static void main(String[] args) {
        EagerSingleton obj3 = EagerSingleton.createEagerSingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("Eager Singleton obj1: " + obj3.hashCode());
        EagerSingleton obj4 = EagerSingleton.createEagerSingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("Eager Singleton obj2: " + obj4.hashCode());
    }
}
