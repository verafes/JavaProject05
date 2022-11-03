import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CountEvenOddValuesInArrayTest {

    // --- CountEvenOddValuesInArray Algorithm
    //1. Positive testing Happy path
    // expectedResult: evenCountVal, oddCountVal; {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1}
    @Test
    public void testPositiveNumbersInArray_HappyPath() {
        //AAA
        //arrange
        int [] array = {1, 22, 22, 4, 555};
        // expectedResult: evenCountVal, oddCountVal;
        int[] expectedResult = {3, 2};

        //act
        int[] actualResult = new CountEvenOddValuesInArray().countEvenOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // mix (positive, negative numbers and zero)
    @Test
    public void testToIntPositiveNegativeNumbersInArray_HappyPath() {
        //AAA
        //arrange
        int [] array = {1, 22, 32, 4, -5555, -10, 0};
        // expectedResult: evenCountVal, oddCountVal;
        int[] expectedResult = {5, 2};

        //act
        int[] actualResult = new CountEvenOddValuesInArray().countEvenOddValuesInArray(array);

       //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // one even number
    @Test
    public void testOneEvenElementInArray_HappyPath() {
        //AAA
        //arrange
        int [] array = {22};
        // expectedResult: evenCountVal, oddCountVal;
        int[] expectedResult = {1, 0};

        //act
        int[] actualResult = new CountEvenOddValuesInArray().countEvenOddValuesInArray(array);

       //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // one odd number
    @Test
    public void testOneOddElementInArray_HappyPath() {
        //AAA
        //arrange
        int [] array = {-12345};
        // expectedResult: evenCountVal, oddCountVal;
        int[] expectedResult = {0, 1};

        //act
        int[] actualResult = new CountEvenOddValuesInArray().countEvenOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // empty array
    @Test
    public void testEmptyArray_Negative() {
        //AAA
        //arrange
        int [] array = {};
        int [] expectedResult = {};

        //act
        int[] actualResult = new CountEvenOddValuesInArray().countEvenOddValuesInArray(array);

         //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
