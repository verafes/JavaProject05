import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class OddIndicesTest {

    /** Positive testing Happy path
     * Algorithm OddIndexes
     *
     * array has even length
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result = {590, 985, 68}
     */

    @Test
    public void testEvenLengthArray_HappyPath() {
        //AAA
        //arrange
        int [] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //array has odd length
    // Expected Result = {590, 985, 68}
    @Test
    public void testOddLengthArray_HappyPath() {
        //AAA
        //arrange
        int [] arr = {-45, 590, 234, 985, 12, 68, 7};
        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    /**
     * allay.length = 1, no odd index
     * return {};
     */
    @Test
    public void testOddIndicesOneElement_HappyPath() {
        //AAA
        //arrange
        int [] arr = {-45};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    /**
     * 2. Negative testing
     * empty array
     */
    @Test
    public void testNoOddNumberEmpty_negative() {
        //AAA
        //arrange
        int[] arr = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(arr);

       //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
