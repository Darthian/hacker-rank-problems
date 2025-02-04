package view;

import org.junit.Assert;
import org.junit.Test;
import service.FunctionalImplementations;

public class FunctionalImplementationTest {

    @Test
    public void testGetStructuresSorted() {
        Assert.assertEquals("2000", FunctionalImplementations.getStructuresSorted());

    }
}
