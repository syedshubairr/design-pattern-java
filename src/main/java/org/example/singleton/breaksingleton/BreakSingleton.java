package org.example.singleton.breaksingleton;

import java.lang.reflect.Constructor;

/**
 * 3 ways to break a singleton design pattern.
 * 1. Using Reflection API in java.
 * You can also make the class enum, and then just get INSTANCE (or any other name enum) from it to get the class object.
 * or you can add a check in the singleton class constructor for the instance that is already created.
 */
public class BreakSingleton {
    public static void main(String[] args) throws Exception {
//        usingReflectionApi();
        usingEnumClass();
    }

    public static void usingReflectionApi() throws Exception {
        System.out.println("USING REFLECTION API");
        /*
        We can break singleton design pattern using Reflection api, using this technique.
        making the constructor accessable in runtime and then creating objects from it.
         */
        SimpleSingleton obj1 = SimpleSingleton.createLazySingleton();
        Constructor<SimpleSingleton> constructor = SimpleSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SimpleSingleton obj2 = constructor.newInstance();
        System.out.println("1 = " + obj1.hashCode());
        System.out.println("2 = " + obj2.hashCode());
        /*
        To stop this above technique you just have to add a CHECK and EXCEPTION in the private constructor in your class.
        if (lazySingleton != null) throws RuntimeException, already done it in this package class.
        remove the content in the constructor, and you will see that it will break the design pattern.
         */
    }

    public static void usingEnumClass() throws Exception {
        System.out.println("USING ENUM CLASS");
        EnumSingleton obj1 = EnumSingleton.INSTANCE;
        System.out.println(obj1.hashCode());
        obj1.testMethod();
    }
}
