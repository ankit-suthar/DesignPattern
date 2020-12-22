package com.singleton.pattern.advancethreadsafe;

public class AdvanceThreadSafeSingleton {

    private static AdvanceThreadSafeSingleton instance;

    private AdvanceThreadSafeSingleton(){}

    // double checked locking principle
    public static AdvanceThreadSafeSingleton getInstance(){
        if(instance==null){
            synchronized (AdvanceThreadSafeSingleton.class){
                if(instance==null) {
                    instance = new AdvanceThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("Advance Thread Safe Singleton Message");
    }
}
