package ru.gb.Lesson_1;

public class App {
    public static void main(String[] args) {
        Runner[] runners = {
                new Human("Семен", 300, 2),
                new Cat("Мурзик", 400,3),
                new Robot("Голиаф", 100, 1)
        };

        Track track = new Track(250);
        for (Runner runner:runners) {
            track.overcome(runner);
        };

    }
}
