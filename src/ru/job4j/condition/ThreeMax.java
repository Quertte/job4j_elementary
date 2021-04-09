package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = second;
        if (third >= second && third >= first) {
            result = third;
        }
        if (first >= second && first >= third) {
            result = first;
        }
        return result;
    }
}
