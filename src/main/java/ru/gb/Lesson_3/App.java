package ru.gb.Lesson_3;

public class App {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Apple> box11 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Orange> box22 = new Box<>();

        for (int i=0; i<5; i++){
            box1.put(new Apple());
        }

        for (int i=0; i<7; i++){
            box2.put(new Orange());
        }

        // считаю веса коробок
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        // сравниваю коробки по весу
        System.out.println(box1.compare(box2));

        // перекладываю из одной коробки в другую
        box1.transfer(box11);
        System.out.println(box1.getWeight());
        System.out.println(box11.getWeight());

        box2.transfer(box22);
        System.out.println(box2.getWeight());
        System.out.println(box22.getWeight());
    }
}
