package com.builder.pattern;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer
                .ComputerBuilder("200","16")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer.getHdd()+" "+computer.getRam()+" "+computer.isBluetoothEnabled()+" "+computer.isGraphicsCardEnabled());
    }
}
