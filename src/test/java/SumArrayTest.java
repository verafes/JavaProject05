import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    /**
     * Positive testing Happy path
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     */

    @Test
    public void testPositiveNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array1 = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array1);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Positive testing Happy path
     * Test Data:
     * {-7, -3} → -10
     */
    @Test
    public void testNegativeNumbers_HappyPath() {

        //AAA
        //arrange
        int[] array2 = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Positive testing Happy path
     * 1 value in array
     * {1} → 1
     */
    @Test
    public void testOneValue_Negative() {

        //AAA
        //arrange
        int[] array3 = {1};
        int expectedResult = 1;

        //act
        int actualResult = new SumArray().sumArray(array3);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * 2. Negative testing
     * Empty array
     * {} → 0
     */
    @Test
    public void testSumArray_empty_Negative() {

        //AAA
        //arrange
        int[] array3 = {};
        int expectedResult = 0;

        //act
        int actualResult = SumArray.sumArray(array3);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
