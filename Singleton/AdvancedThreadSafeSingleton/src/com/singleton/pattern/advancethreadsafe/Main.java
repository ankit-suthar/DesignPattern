package com.singleton.pattern.advancethreadsafe;

public class Main {

    public static void main(String[] args) {
        AdvanceThreadSafeSingleton instance = AdvanceThreadSafeSingleton.getInstance();
        instance.getMessage();
    }
}
