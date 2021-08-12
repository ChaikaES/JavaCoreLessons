package ru.gb.Lesson_2;

public class App {

    public static void main(String[] args) {
        String[][] arr = {
                {"1","2","3","4"},
                {"5","6","n","8"},
                {"9","12","13","14"},
                {"11","21","31","41"}
        };

        try {
            int result = run(arr);
            System.out.println(result);
        } catch (MyArrayDataException e) {
            System.out.println(e.toString());
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива");
        }

    }

    public static int run(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                try {
                    int value = Integer.parseInt(arr[i][j]);
                    sum = sum + value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + 1, j + 1, arr[i][j]);
                }
            }
        }

        return sum;
    }
}
