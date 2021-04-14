package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10},
                {20, 30},
                {40, 50, 60},
                {70, 80, 90, 100}
        };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers[i].length);
        }
    }
}
