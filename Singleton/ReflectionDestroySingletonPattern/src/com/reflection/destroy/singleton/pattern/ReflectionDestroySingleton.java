package com.reflection.destroy.singleton.pattern;

public class ReflectionDestroySingleton {

    private static ReflectionDestroySingleton instance = new ReflectionDestroySingleton();

    private ReflectionDestroySingleton(){}

    public static ReflectionDestroySingleton getInstance(){
        return instance;
    }

    public void getMessage(){
        System.out.println("Reflection to destroy Singleton Pattern");
    }
}
