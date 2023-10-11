
import org.junit.*;

public class MathsTest {
    Maths maths;

    @Before
    public void setUpInstance() {
        maths = new Maths();

    }

    @Test
    public void checkTheSumOfTwoNumbersThatEqualsThree() {
        Assert.assertEquals(3, maths.addTwoNumbers(9, 7));
    }

    @Test
    public void checkTheSumOfTwoNumbersThatEqualsThreeAgain() {
        Assert.assertEquals(3, maths.addTwoNumbers(3, 6));
    }
    @Test
    public void checkIfNumberIsPrime() {
        Assert.assertTrue(maths.checkPrime(7));
    }
}
