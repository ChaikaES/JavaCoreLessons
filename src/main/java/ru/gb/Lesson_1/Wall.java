package ru.gb.Lesson_1;

public class Wall implements Obstacle {
    int height;

    Wall(int hgt) {
        height = hgt;
    }

    public boolean overcome(Runner runner) {
        return runner.jump(height);
    }
}
