import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
 * и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.
 * Test Data:
 * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
 */

public class SumOfTwoTest {

    //1. Positive testing Happy path
    // valid array, array.length > 1
    @Test
    public void testPositiveNumsArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        //act
        int[][] actualResult = SumOfTwo.sumOfTwo(array, sum);

       //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // valid array has 3 equal numbers
    @Test
    public void testEqualNumsArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {5, 5, 5};
        int sum = 10;
        int[][] expectedResult = {{5, 5}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, sum);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoEqualNumsArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {5, 5};
        int sum = 10;
        int[][] expectedResult = {{5, 5}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, sum);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    // Negative testing
    // null
    @Test
    public void testNull_Negative() {
        //AAA
        //arrange
        int[] array = null;
        int sum = 0;
        int[][] expectedResult = {};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, sum);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // empty array
    @Test
    public void Test_NullArray_Negative() {
        //AAA
        //arrange
        int[] array = {};
        int sum = 0;
        int[][] expectedResult = {};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, sum);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
