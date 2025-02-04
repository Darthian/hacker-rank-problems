package view;

import org.junit.Assert;
import org.junit.Test;
import service.DemoService;

public class DemoServiceTest {

    @Test
    public void testGetCharacter() {
        Assert.assertEquals("w", DemoService.getCharacter("swiss"));
        Assert.assertEquals("v", DemoService.getCharacter("level"));
        //TODO Assert.assertEquals(null, DemoService.getCharacter("aabbcc"));
    }
}
