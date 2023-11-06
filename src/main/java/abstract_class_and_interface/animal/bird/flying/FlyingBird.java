package abstract_class_and_interface.animal.bird.flying;

import abstract_class_and_interface.Fly;
import abstract_class_and_interface.animal.bird.Bird;

public class FlyingBird extends Bird implements Fly {

    public FlyingBird(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
        super(name, color, numberOfPassenger, kindOfFuel, material, voice);
    }

    @Override
    public void flying() {

    }
}
