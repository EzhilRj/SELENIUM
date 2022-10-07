package TestNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {

    SoftAssert softAssert1 = new SoftAssert();
    SoftAssert softAssert2 = new SoftAssert();

    @Test
    void demoTest1() {
        softAssert1.assertEquals("welcome", "Wel"); // false - failed
    }

    @Test
    void demoTest2() {
        softAssert2.assertEquals("welcome", "welcome"); // true - passed
        softAssert1.assertAll();
        softAssert2.assertAll();
    }

}
