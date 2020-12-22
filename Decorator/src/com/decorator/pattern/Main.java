package com.decorator.pattern;

public class Main {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxurySportCar = new SportsCar(new LuxuryCar(new BasicCar()));
        luxurySportCar.assemble();
    }
}
