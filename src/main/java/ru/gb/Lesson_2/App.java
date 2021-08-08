package ru.gb.Lesson_2;

public class App {

    public static void main(String[] args) throws MyArraySizeException {
        String[][] arr = new String[4][4];

        run(arr);
    }

    public static void run(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }
    }
}
