package com.reflection.destroy.singleton.pattern;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        ReflectionDestroySingleton instance1 = ReflectionDestroySingleton.getInstance();
        ReflectionDestroySingleton instance2 = null;

        try{
            Constructor[] constructors = ReflectionDestroySingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                //This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (ReflectionDestroySingleton) constructor.newInstance();
                break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        // Hashcode of instance1 and instance2 is different
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.getMessage();
        instance2.getMessage();
    }
}
