package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        // Get object using the static method.
        LazySingleton obj = LazySingleton.createLazySingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("This is object: " + obj.hashCode());
        LazySingleton obj2 = LazySingleton.createLazySingleton();
        // The hashcode method gets the hashcode of the object, hashcode will be same if the reference object is same.
        System.out.println("This is object2: " + obj2.hashCode());
    }
}
