package ru.gb.Lesson_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CSVWriter {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> row1 = new LinkedHashMap<>();
        row1.put("first", 11);
        row1.put("second", 12);
        row1.put("third", 13);

        LinkedHashMap<String, Integer> row2 = new LinkedHashMap<>();
        row2.put("first", 21);
        row2.put("second", 22);
        row2.put("third", 23);

        LinkedHashMap<String, Integer> row3 = new LinkedHashMap<>();
        row3.put("first", 31);
        row3.put("second", 32);
        row3.put("third", 33);

        ArrayList<LinkedHashMap<String, Integer>> data = new ArrayList<>();
        data.add(row1);
        data.add(row2);
        data.add(row3);

        writeCSV(data);
    }

    public static void writeCSV(ArrayList<LinkedHashMap<String, Integer>> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("demo.csv"))) {
            for (int row = 0; row < data.size(); row++) {
                if (row == 0) {
                    // пишем имена колонок
                    for (String key: data.get(row).keySet()) {
                        writer.write(key + ";");
                    }
                    writer.write("\n");
                }

                for (Integer value: data.get(row).values()) {
                    // пишем значения
                    writer.write(value.toString() + ";");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
