package controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MainTest {

    private String[] input;

    @After
    public void setUp() {
    }

    @Test
    public void testMain() {
        input = new String[]{"123fgh45", "1234oht", "1sdf"};
        System.out.println(input.length);
        Assert.assertEquals("1", Main.solveProblem(input));
    }
}
