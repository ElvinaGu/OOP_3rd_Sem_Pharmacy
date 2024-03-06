package core.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
//        return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
//        return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public int compareTo(Medicine o) {
        //if (components.getClass().isInstance(o.components.getClass())) return 0;

        return this.getsPower() - o.getsPower();
//        if (this.getsPower() > o.getsPower()) return 1;
//        else if (this.getsPower() < o.getsPower()) return -1;
//        else return 0;
    }

    public int getsPower(){
        int pow = 0;
        for(MedicineComponent component : components){
           pow += component.getPower();
        }
        return pow;
    }

    public List<MedicineComponent> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }
}
