package d.interfac.segregation;

import d.interfac.segregation.interfaces.Flyable;

public class Helicopter implements Flyable {
    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
