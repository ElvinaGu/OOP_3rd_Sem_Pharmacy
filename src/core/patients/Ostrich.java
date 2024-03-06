package core.patients;

import core.Animal;
import core.Goable;
import core.Owner;

import java.time.LocalDate;

public class Ostrich extends Animal implements Goable {
    public Ostrich(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats plants, roots, fruits, insects, lizards and small rodents.");
    }

    @Override
    public double run() {
        return 70;
    }
}
