package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        Dummy obj = Dummy.createDummy();
        System.out.println("This is object: " + obj.hashCode());
        Dummy obj2 = Dummy.createDummy();
        System.out.println("This is object2: " + obj2.hashCode());
    }
}
