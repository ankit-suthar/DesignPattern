package com.singleton.pattern.lazy.initialization;

public class Main {

    public static void main(String[] args) {
        LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
        instance.printMessage();
    }
}
