package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    void demoTest() {

        Assert.assertTrue (true); // passed
        Assert.assertEquals("welcome", "welcome"); // true - passed
        Assert.assertEquals("selenium", "selenium"); // true passed
        System.out.println("Successfully passed!");
    }

}
