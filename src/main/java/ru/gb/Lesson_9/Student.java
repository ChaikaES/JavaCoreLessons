package ru.gb.Lesson_9;

import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.courses = courses;
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setName(String name) {
        this.name = name;
    }
}
