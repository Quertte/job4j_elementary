package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void whenArrayWithOddElements() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(result, expected);
    }
}