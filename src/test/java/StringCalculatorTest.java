package test.java;

import junit.framework.Assert;
import junit.framework.TestCase;
import main.java.StringCalculator;

/**
 * Created by robin on 05/04/2017.
 */
public class StringCalculatorTest extends TestCase {
    public void testSimpleAdd() {
        StringCalculator stringCalculator = new StringCalculator();
        int actual = stringCalculator.add("1");
        Assert.assertEquals(1,actual);
    }
}
