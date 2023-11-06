package abstract_class_and_interface.animal.pet;

import abstract_class_and_interface.Move;
import abstract_class_and_interface.animal.Animal;

public class Pet extends Animal implements Move {
    public Pet(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
        super(name, color, numberOfPassenger, kindOfFuel, material, voice);
    }

    @Override
    public void moving() {

    }
}
