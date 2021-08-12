package ru.gb.Lesson_2;

public class MyArrayDataException extends Exception {
    int row;
    int col;
    String value;

    MyArrayDataException (int row, int col, String value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public String toString() {
        return String.format("Ошибка в строке %s колонке %s. Значение в ячейке \"%s\"", row, col, value);
    }
}
