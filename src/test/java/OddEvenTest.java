import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    /**
     * Positive testing Happy path
     * Test Data:
     * positive odd number: 345 →  “Odd”
     */

    @Test
    public void testOddNumber() {
        //AAA
        //arrange
        int n = 345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Positive testing - Happy Path
     * negative odd number: -345 →  “Odd”
     */

    @Test
    public void testOddNumber_OddNumNegative_HappyPath() {
        //AAA
        //arrange
        int n = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Positive testing - Happy Path
     * 0 →  “even”
     */

    @Test
    public void testOddNumber_Zero_HappyPath() {
        //AAA
        //arrange
        int n = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Positive testing - Happy Path
     * negative even number -2222 →  “even”
     */
    @Test
    public void testEvenNumber_evenNumPositive_HappyPath() {
        //AAA
        //arrange
        int n = 4444;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Positive testing - Happy Path
     * negative even number -2222 →  “even”
     */
    @Test
    public void testEvenNumber_evenNumNegative_HappyPath() {
        //AAA
        //arrange
        int n = 4444;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
