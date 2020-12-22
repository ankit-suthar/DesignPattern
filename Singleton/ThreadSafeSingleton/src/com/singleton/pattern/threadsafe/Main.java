package com.singleton.pattern.threadsafe;

public class Main {

    public static void main(String[] args) {
        ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
        instance.printMessage();
    }
}
