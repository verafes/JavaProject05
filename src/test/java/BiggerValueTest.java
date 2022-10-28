import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    /**
     * Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    //1. Positive testing Happy path
    // num1 < num2
    @Test
    public void testNun1LessThanNum2_2Positive_HappyPath() {
        //AAA
        //arrange
        int num1 = 3333;
        int num2 = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(num1, num2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // num1 < num2
    @Test
    public void testNum1LessThanNum2_oneNegative_HappyPath() {
        //AAA
        //arrange
        int num1 = -9999;
        int num2 = 9;
        int expectedResult = 9;

        //act
        int actualResult = new BiggerValue().biggerValue(num1, num2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // num1 > num2
    @Test
    public void testNum1GreaterThanNum2_oneNegativeNum_HappyPath() {

        //AAA
        //arrange
        int num1 = 3333;
        int num2 = -3333;
        int expectedResult = 3333;

        //act
        int actualResult = new BiggerValue().biggerValue(num1, num2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // num1 == num2
    @Test
    public void BiggerValue_Num1EqualsToNum2_PositiveNums_HappyPath() {

        //AAA
        //arrange
        int num1 = 3333;
        int num2 = 3333;
        int expectedResult = 3333;

        //act
        int actualResult = BiggerValue.biggerValue(num1, num2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
