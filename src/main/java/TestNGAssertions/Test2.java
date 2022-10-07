package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    void demoTest() {

        Assert.assertTrue (true); // passed
        Assert.assertEquals("welcome", "Welcome"); // false - failed
        Assert.assertEquals("selenium", "selenium");
        System.out.println("Successfully passed!");
    }

}
