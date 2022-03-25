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
    public void testFirstTest() {
        input = new String[]{"123fgh45", "1234oht", "1sdf"};
        Assert.assertEquals("1", Main.solveProblem(input));
    }

    @Test
    public void testWithoutCommonPrefixTest() {
        input = new String[]{"dfgh", "abcd", "ab", "a"};
        Assert.assertEquals("", Main.solveProblem(input));
    }

    @Test
    public void testCommonPrefixTest() {
        input = new String[]{"qwerty", "qwg", "qwe"};
        Assert.assertEquals("qw", Main.solveProblem(input));
    }

    @Test
    public void testEmptyTest() {
        input = new String[]{"qwerty", "qwg", ""};
        Assert.assertEquals("q", Main.solveProblem(input));
    }

    @Test
    public void testEmpty2Test() {
        input = new String[]{};
        Assert.assertEquals("", Main.solveProblem(input));
    }

    @Test
    public void testEmpty3Test() {
        input = new String[]{"", "", ""};
        Assert.assertEquals("", Main.solveProblem(input));
    }
}
