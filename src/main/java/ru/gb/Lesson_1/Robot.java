package ru.gb.Lesson_1;

public class Robot implements Runner {
    int run_limit;
    int jump_limit;
    String name;

    Robot(String name, int run_limit, int jump_limit){
        this.jump_limit = jump_limit;
        this.run_limit = run_limit;
        this.name = name;
    }

    public boolean run(int distance){
        if (run_limit >= distance) {
            System.out.println(name + " пробежал " + distance + "м");
            return true;
        }
        else {
            System.out.println(name + " не смог преодолеть препятствие");
            return false;
        }
    }

    public boolean jump (int height){
        if (jump_limit >= height) {
            System.out.println(name + " перепрыгнул " + height + "м");
            return true;
        }
        else {
            System.out.println(name + " не смог преодолеть препятствие");
            return false;
        }
    }
}
