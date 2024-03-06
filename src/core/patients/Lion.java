package core.patients;

import core.Animal;
import core.Goable;
import core.Owner;
import core.Swimable;

import java.time.LocalDate;

public class Lion extends Animal implements Swimable, Goable {
    public Lion(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats large mammals.");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " can swim across a river.");
    }

    @Override
    public double run() {
        return 73;
    }
}
