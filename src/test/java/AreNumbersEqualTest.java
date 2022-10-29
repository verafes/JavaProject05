import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    /**
     * Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     * 0, если числа равны
     * -1, если первое число меньше второго
     * 1, если первое число больше второго
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     */

    //1. Positive testing Happy path
    // number1 == number2

    @Test
    public void testNum1EqualsToNum2_TwoPositive_HappyPath() {
        //AAA
        //arrange
        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // number1 < number2
    @Test
    public void testNum1LessThanNum2_oneNegative_HappyPath() {
        //AAA
        //arrange
        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // num1 > num2
    @Test
    public void testNum1GreaterThanNum2_secondNegativeNum_HappyPath() {

        //AAA
        //arrange
        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // num1 == num2
    @Test
    public void testNum1EqualsToNum2_Zeros_HappyPath() {

        //AAA
        //arrange
        int number1 = 0;
        int number2 = 0;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
