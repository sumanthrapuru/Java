package com.sumanth.java8.ch30serialization;

public class ElectricBike extends Bike {
    private String motorCapacity;

    public ElectricBike(String name, Double price, String color, String motorCapacity) {
        super(name, price, color);
        this.motorCapacity = motorCapacity;
    }

    @Override
    public String toString() {
        return "ElectricBike{" +
                "motorCapacity='" + motorCapacity + '\'' +
                "} " + super.toString();
    }
}
