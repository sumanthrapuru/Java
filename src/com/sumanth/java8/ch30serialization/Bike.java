package com.sumanth.java8.ch30serialization;

import java.io.Serializable;

public class Bike implements Serializable {

    //java.io.InvalidClassException: com.sumanth.java8.ch30serialization.Bike; local class incompatible:
    // stream classdesc serialVersionUID = 1, local class serialVersionUID = 2
    private static final long serialVersionUID = 1L;//2L

    private String name;
    transient private Double price;
    private String color;

    public Bike(String name, Double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
