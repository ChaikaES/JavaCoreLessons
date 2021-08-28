package ru.gb.Lesson_5;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;
    private int rowsCount = 0;

    public AppData(int colCount) {
        header = new String[colCount];
        data = new int[colCount][];
    }

    public void setColumnNames(String[] columnNames) {
        header = columnNames;
    }

    public void addRow(String[] items) {
        int[] numbers = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }

        data[rowsCount] = numbers;
        rowsCount += 1;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + Arrays.deepToString(data) +
                ", rowsCount=" + rowsCount +
                '}';
    }
}