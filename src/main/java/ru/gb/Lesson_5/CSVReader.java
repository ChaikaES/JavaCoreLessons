package ru.gb.Lesson_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        AppData data = readCsv("demo.csv");

        System.out.println(data);
    }

    public static AppData readCsv(String fileName) {
        String str;
        int rowCounter = 0;
        AppData storage = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((str = reader.readLine()) != null) {
                String[] values = str.split(";");

                if (storage == null) {
                    storage = new AppData(values.length);
                }

                if (rowCounter == 0) {
                    storage.setColumnNames(values);
                } else {
                    storage.addRow(values);
                }

                rowCounter += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return storage;
    }

}
