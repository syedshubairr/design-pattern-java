package org.example.singleton;

public class LazyMain {
    public static void main(String[] args) {
        LazySingleton obj = LazySingleton.createLazySingleton();
        LazySingleton obj1 = LazySingleton.createLazySingleton();
        System.out.println("Obj 1 =" + obj.hashCode());
        System.out.println("Obj 2 =" + obj1.hashCode());
    }
}
