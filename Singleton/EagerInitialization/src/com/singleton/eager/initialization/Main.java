package com.singleton.eager.initialization;

public class Main {

    public static void main(String[] args) {
        EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
        instance.printMessage();
    }
}
