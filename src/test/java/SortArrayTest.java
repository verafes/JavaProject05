import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
 * и сортирует элементы массива в порядке возрастания.
 * Test Data:
 * {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
 */

public class SortArrayTest {

    //1. Positive testing Happy path
    // valid array with positive numbers only

    @Test
    public void testPositiveNums_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //act
        int[] actualResult = new SortArray().bubbleSort(array);

        long start = 0;
        start = System.nanoTime();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

        long end = 0;
        end = System.nanoTime();
        System.out.println(end-start);
    }

    // valid array with positive and negative numbers
    @Test
    public void testPositiveAndNegativeNums_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, -7, 12, 5, 0, 2, 9, -4, 12};
        int[] expectedResult = {-7, -4, 0, 2, 3, 4, 5, 9, 12, 12};

        //act
        int[] actualResult = new SortArray().bubbleSort(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // array with one positive number
    @Test
    public void testOneNegativeNumber_HappyPath() {
        //AAA
        //arrange
        int[] array = {-1};
        int[] expectedResult = {-1};

        //act
        int[] actualResult = new SortArray().bubbleSort(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // array with one positive number
    @Test
    public void testOnePositiveNumber_HappyPath() {
        //AAA
        //arrange
        int[] array = {1};
        int[] expectedResult = {1};

        //act
        int[] actualResult = new SortArray().bubbleSort(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // 2. Negative testing
    // empty array
    @Test
    public void Test_EmptyArray_Negative() {
        //AAA
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new SortArray().bubbleSort(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // null array
    @Test
    public void Test_NullArray_Negative() {
        //AAA
        //arrange
        int[] array = null;
        int[] expectedResult = {};

        //act
        int[] actualResult = new SortArray().bubbleSort(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
