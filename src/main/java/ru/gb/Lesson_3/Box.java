package ru.gb.Lesson_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> elements;

    public Box(){
        elements = new ArrayList<>();
    }

    public float getWeight(){
        float sum = 0;
        for (T element: elements) {
            sum += element.getWeight();
        }
        return sum;
    }

    public void put(T element){
        elements.add(element);
    }

    public boolean compare(Box<?> another) {
        if (this.getWeight() == another.getWeight()) {
            return true;
        } else {
            return false;
        }
    }
}
