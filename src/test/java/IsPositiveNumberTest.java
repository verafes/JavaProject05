import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Testing the algorithm: IsPositiveNumber
 * checks the number is greater than 0 or not
 * Test data: 555, 0 and -555.
 */

public class IsPositiveNumberTest {

    //1. Positive testing Happy path
    // number > 0
    @Test
    public void testPositiveNumber_HappyPath() {
        //AAA
        //arrange
        int number = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // number < 0
    @Test
    public void testNegativeNumber_HappyPath() {
        //AAA
        //arrange
        int number = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // number < 0
    @Test
    public void testZero_HappyPath() {
        //AAA
        //arrange
        int number = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
