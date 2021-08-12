package ru.gb.Lesson_3;

public class App {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();

        for (int i=0; i<5; i++){
            box1.put(new Apple());
        }

        for (int i=0; i<7; i++){
            box2.put(new Orange());
        }

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        System.out.println(box1.compare(box2));
    }
}
