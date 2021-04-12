package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int e1 = 5;
        int result = FindLoop.indexOf(data, e1);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayHas6Then3() {
        int[] data = {1, 0, 4, 6, 7, 54};
        int e1 = 6;
        int result = FindLoop.indexOf(data, e1);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayHasNot3ThenMinus1() {
        int[] data = {5, 4, 2, 1, 1, 1};
        int e1 = 3;
        int result = FindLoop.indexOf(data, e1);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}