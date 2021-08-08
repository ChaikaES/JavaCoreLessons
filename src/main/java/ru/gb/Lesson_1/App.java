package ru.gb.Lesson_1;

public class App {
    public static void main(String[] args) {
        Runner[] runners = {
                new Human("Семен", 300, 2),
                new Cat("Мурзик", 400,3),
                new Robot("Голиаф", 100, 1)
        };

        Obstacle[] obstacles = {
                new Track(100),
                new Wall(2),
                new Track(300),
                new Wall(2),
                new Track(350),
                new Wall(3)
        };

        for (Runner runner:runners) {
            for (Obstacle obstacle: obstacles) {
                if (!obstacle.overcome(runner)) {
                    break;
                }
            }
        }

    }
}
