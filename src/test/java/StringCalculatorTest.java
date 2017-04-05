package test.java;
import junit.framework.Assert;
import junit.framework.TestCase;
import main.java.StringCalculator;

/**
 * Created by robin on 05/04/2017.
 */
public class StringCalculatorTest extends TestCase {

    public void test_should_return_single_int_as_is() {
        StringCalculator stringCalculator = new StringCalculator();
        int actual = stringCalculator.add("1");
        Assert.assertEquals(1,actual);
    }
    public void test_should_return_sum_of_two_ints_separated_by_a_coma() {
        StringCalculator stringCalculator = new StringCalculator();
        int actual = stringCalculator.add("1,1");
        Assert.assertEquals(2,actual);
    }
    public void test_should_return_sum_of_multiple_ints_separated_by_a_coma() {
        StringCalculator stringCalculator = new StringCalculator();
        int actual = stringCalculator.add("1,1,1");
        Assert.assertEquals(3,actual);
    }
    public void test_should_return_sum_of_multiple_ints_separated_by_a_new_line() {
        StringCalculator stringCalculator = new StringCalculator();
        int actual = stringCalculator.add("1,1\n1");
        Assert.assertEquals(3,actual);
    }
    public void test_should_not_accept_two_delimeters_at_the_same_time(){
        StringCalculator stringCalculator = new StringCalculator();

        try{
            stringCalculator.add("1,\n1");
            Assert.fail("This should have failed, stupid");
        }
        catch (Exception e){
        }
    }
}
