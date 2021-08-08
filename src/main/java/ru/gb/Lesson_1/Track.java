package ru.gb.Lesson_1;

public class Track {
    int distance;

    Track(int dist) {
        distance = dist;
    }

    public boolean overcome(Runner runner) {
        return runner.run(distance);
    }
}

