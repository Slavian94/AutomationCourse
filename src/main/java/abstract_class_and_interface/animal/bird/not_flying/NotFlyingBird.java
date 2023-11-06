package abstract_class_and_interface.animal.bird.not_flying;

import abstract_class_and_interface.Move;
import abstract_class_and_interface.animal.bird.Bird;

public class NotFlyingBird extends Bird implements Move {
    public NotFlyingBird(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
        super(name, color, numberOfPassenger, kindOfFuel, material, voice);
    }

    @Override
    public void moving() {

    }
}
