package abstract_class_and_interface.animal.fish;

public class Pike extends Fish{
    public Pike(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
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

    @Override
    public void swimming() {
        super.swimming();
    }
}
