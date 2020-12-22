package com.singleton.pattern.lazy.initialization;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance(){
        if(instance==null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("Lazy Initialized Singleton Message");
    }
}
