package org.example.singleton.breaksingleton;

public enum EnumSingleton {
    INSTANCE;

    public void testMethod() {
        System.out.println("Inside Enum class method");
    }
}
