package ru.gb.Lesson_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Course biology = new Course("Biology");
        Course math = new Course("Math");
        Course sociology = new Course("Sociology");
        Course philosophy = new Course("Philosophy");
        Course physics = new Course("Physics");
        Course chemistry = new Course("Chemistry");
        Course history = new Course("History");


        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("John", Arrays.asList(biology, math)),
                new Student("Mary", Arrays.asList(sociology, philosophy)),
                new Student("Ryan", Arrays.asList(math, physics, chemistry)),
                new Student("Andrew", Arrays.asList(chemistry, biology)),
                new Student("Sofi", Arrays.asList(biology, philosophy)),
                new Student("Ned", Arrays.asList(sociology, philosophy, history, biology)),
                new Student("Paul", Arrays.asList(biology, math, physics)),
                new Student("Susan", Arrays.asList(history, philosophy)),
                new Student("Ted", Arrays.asList(philosophy, chemistry, physics, biology)),
                new Student("Mark", Arrays.asList(chemistry, biology, history))
        ));

        System.out.println(getUniqueCourses(students));
        System.out.println(getMostCurious(students));
        System.out.println(filterStudentsByCourse(students, chemistry));
    }

    public static Set<String> getUniqueCourses(List<Student> students) {
        return students.stream()
                .map(Student::getCourses)
                .flatMap(List::stream) // нашла на Stackoverflow
                .map(Course::getName)
                .collect(Collectors.toSet());
    }

    public static List<String> getMostCurious(List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .map(Student::getName)
                .collect(Collectors.toList())
                .subList(0, 3);
    }

    public static List<String> filterStudentsByCourse(List<Student> students, Course course) {
        return students.stream()
                .filter(student -> student.getCourses().contains(course))
                .map(Student::getName)
                .collect(Collectors.toList());
    }
}
