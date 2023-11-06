package abstract_class_and_interface.animal.bird;

import abstract_class_and_interface.animal.Animal;

public class Bird extends Animal {
    public Bird(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
        super(name, color, numberOfPassenger, kindOfFuel, material, voice);
    }

    @Override
    protected void eating() {
        super.eating();
    }

    @Override
    protected void sleeping() {
        super.sleeping();
    }
}
