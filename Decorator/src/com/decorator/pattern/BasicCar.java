package com.decorator.pattern;

public class BasicCar implements Car {

    public BasicCar() {
    }

    @Override
    public void assemble() {
        System.out.println("Basic car");
    }
}
