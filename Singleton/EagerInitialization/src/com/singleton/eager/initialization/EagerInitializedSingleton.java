package com.singleton.eager.initialization;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton eagerInitializedSingleton = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return eagerInitializedSingleton;
    }

    public void printMessage() {
        System.out.println("Eager Initialized Singleton Pattern Message");
    }
}
