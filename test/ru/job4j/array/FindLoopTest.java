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

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind5() {
        int[] data = {1, 5, 4, 7, 6, 0, 9, 10, 3};
        int e1 = 0;
        int start = 4;
        int finish = 7;
        int result = FindLoop.indexOf(data, e1, start, finish);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenNotFound() {
        int[] data = {5, 7, 9, 11, 14};
        int e1 = 5;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(data, e1, start, finish);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}