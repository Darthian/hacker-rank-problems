package controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private String[] input;

    @Before
    public void setUp() {
    }

    @Test
    public void testFirstCase() {
        input = new String[]{"123fgh45", "1234oht", "1sdf"};
        Assert.assertEquals("1", Main.solveProblem(input));
    }

    @Test
    public void testWithoutCommonPrefixCase() {
        input = new String[]{"dfgh", "abcd", "ab", "a"};
        Assert.assertEquals("", Main.solveProblem(input));
    }

    @Test
    public void testCommonPrefixCase() {
        input = new String[]{"qwerty", "qwg", "qwe"};
        Assert.assertEquals("qw", Main.solveProblem(input));
    }

    @Test
    public void testNoPrefixCase() {
        input = new String[]{"qwerty", "qwg", ""};
        Assert.assertEquals("", Main.solveProblem(input));
    }

    @Test
    public void testEmptyCase() {
        input = new String[]{};
        Assert.assertEquals("", Main.solveProblem(input));
    }

    @Test
    public void testEntirePrefixCase() {
        input = new String[]{"asd","asd"};
        Assert.assertEquals("asd", Main.solveProblem(input));
    }

    @Test
    public void testEmptyAllCase() {
        input = new String[]{"", "", ""};
        Assert.assertEquals("", Main.solveProblem(input));
    }
}
