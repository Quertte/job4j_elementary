package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {2, 5, 8, 0, 10, 11};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 10, 8, 0, 5, 11};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void whenSwap5To6() {
        int[] input = {11, 22, 33, 44, 55, 66, 77, 88};
        int source = 5;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 22, 33, 44, 55, 77, 66, 88};
        Assert.assertArrayEquals(result, expected);
    }
}