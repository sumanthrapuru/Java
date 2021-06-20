package com.sumanth.patterns.creationalpatterns;

interface Animal {
    void run();
}

/**
 * focus on class polymorphism
 * w/o exposing creation logic we create objects
 * ref them using common interface
 */
public class FactoryPattern {

}

class Tiger implements Animal {
    @Override
    public void run() {
        System.out.println("Tiger is running!");
    }
}

class Elephant implements Animal {
    @Override
    public void run() {
        System.out.println("Elephant is running!");
    }
}

class Turtle implements Animal {
    @Override
    public void run() {
        System.out.println("Turtle is running!");
    }
}

class AnimalFactory {
    public Animal getAnimal(String species) {
        switch (species.toUpperCase()) {
            case "TIGER":
                 return new Tiger();
            case "ELEPHANT":
                 return new Elephant();
            case "Turtle":
                 return new Turtle();
            default: return null;
        }

    }
}