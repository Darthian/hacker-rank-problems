package view;

import org.junit.Assert;
import org.junit.Test;
import service.SumNumberArray;

import java.util.Arrays;

public class SumNumberArrayTest {

    @Test
    public void twoSumTest() {
        Assert.assertEquals(Arrays.asList(0, 1), SumNumberArray.twoSum(Arrays.asList(2, 7, 11, 15), 9));
        Assert.assertEquals(Arrays.asList(1, 2), SumNumberArray.twoSum(Arrays.asList(3, 2, 4), 6));
        Assert.assertEquals(Arrays.asList(0, 1), SumNumberArray.twoSum(Arrays.asList(3, 3), 6));
        Assert.assertEquals(Arrays.asList(0, 2), SumNumberArray.twoSum(Arrays.asList(3, 0, 3), 6));
    }
}
