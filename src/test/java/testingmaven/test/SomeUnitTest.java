package testingmaven.test;
import junit.framework.TestCase;

/**
 * Created by Raul on 2/16/2017.
 */
public class SomeUnitTest extends TestCase{
    public void testSubtractTwoNumbers() throws Exception {

        int answer = SomeUnit.subtractTwoNumbers(2,1);
        assertEquals(1, answer);
    }

    public void testAddTwoNumbers() throws Exception{
        int answer = SomeUnit.addTwoNumbers(1, 2);
        assertEquals(3, answer);
    }

}
