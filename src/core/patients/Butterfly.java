package core.patients;

import core.Animal;
import core.Flyable;
import core.Owner;

import java.time.LocalDate;

public class Butterfly extends Animal implements Flyable {
    public Butterfly(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats flower nectar.");
    }

    @Override
    public double fly() {
        return 12;
    }
}
