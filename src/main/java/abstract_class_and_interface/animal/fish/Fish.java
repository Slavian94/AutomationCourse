package abstract_class_and_interface.animal.fish;

import abstract_class_and_interface.Swim;
import abstract_class_and_interface.animal.Animal;

public class Fish extends Animal implements Swim {
    public Fish(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
        super(name, color, numberOfPassenger, kindOfFuel, material, voice);
    }

    @Override
    public void swimming() {

    }
}
