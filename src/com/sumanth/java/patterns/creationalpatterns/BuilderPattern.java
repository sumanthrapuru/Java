package com.sumanth.java.patterns.creationalpatterns;

/**
 * Data attributes grow Constructor will grow
 * BPattern less maintainable code
 * new optional field added. code that creates this obj doesn't have change
 * who ever wants wants to use uses method chain to fill this attribute
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setBrand("Ford")
                .setName("Fiesta")
                .setColor("White")
                .setHorsePower(3)
                //.setNoOfDoors(5)//we don't have to specify this. the algorithm is going to work just fine.
                .build();
        System.out.println(car);
    }

}


class Car {
    private String brand;
    private String name;
    private String color;
    private int horsePower;
    private int noOfDoors;

//    public Car(String brand, String name, String color, int horsePower, int noOfDoors) {
//        this.brand = brand;
//        this.name = name;
//        this.color = color;
//        this.horsePower = horsePower;
//        this.noOfDoors = noOfDoors;
//    }

    static class CarBuilder {
        private String brand;
        private String name;
        private String color;
        private int horsePower;
        private int noOfDoors;

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public CarBuilder setNoOfDoors(int noOfDoors) {
            this.noOfDoors = noOfDoors;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.brand = this.brand;
            car.name = this.name;
            car.color = this.color;
            car.horsePower = this.horsePower;
            car.noOfDoors = this.noOfDoors;
            return car;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    public String getColor() {
        return color;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getHorsePower() {
        return horsePower;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

//    public void setHorsePower(int horsePower) {
//        this.horsePower = horsePower;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", noOfDoors=" + noOfDoors +
                '}';
    }

//    public void setNoOfDoors(int noOfDoors) {
//        this.noOfDoors = noOfDoors;
//    }


}
