package com.singleton.pattern.threadsafe;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("Thread Safe Singleton Message");
    }
}
