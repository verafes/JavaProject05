import org.testng.Assert;
import org.testng.annotations.Test;

public class IsGoodBadPoorNumberTest {

    /**
     * testing Good, Bad or Poor Number Algorithm
     *
     * Given an integer M perform the following conditional actions:
     * If M is multiple of 7 and 9 then return "Good Number".
     * If M is only multiple of 9 and not of 7  then return "Bad Number"
     * If M is only multiple of 11 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     */

    //1. Positive testing Happy path
    //M is multiple of 7 and 9, not 11
    @Test
    public void testIsMultiply7And9Not11_HappyPath() {
        //AAA
        //arrange
        int M = 126;
        String expectedResult = "Good Number";

        //act
        String actualResult = new IsGoodBadPoorNumber().isGoodBadPoorNumber(M);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //M is multiple of 9 but not 7 (M might be multiple of 11)
    @Test
    public void testIsMultiply9Not7_HappyPath() {
        //AAA
        //arrange
        int M = -99;
        String expectedResult = "Bad Number";

        //act
        String actualResult = new IsGoodBadPoorNumber().isGoodBadPoorNumber(M);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // M is multiple of 11 only
    @Test
    public void testIsMultiple11only_HappyPath() {
        //AAA
        //arrange
        int M = 33;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new IsGoodBadPoorNumber().isGoodBadPoorNumber(M);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // M is multiple each of 7, 9, 11, not 11 only
    @Test
    public void testIsMultipleEach_Positive_HappyPath() {
        //AAA
        //arrange
        int M = 693;
        String expectedResult = "Good Number";

        //act
        String actualResult = new IsGoodBadPoorNumber().isGoodBadPoorNumber(M);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // M doesn't satisfy any of the conditions
    // e.g. M is not multiple any of 7, 9, 11 numbers
    @Test
    public void testIsNotMultiplyOfAny_Negative_HappyPath() {
        //AAA
        //arrange
        int M = -1;
        String expectedResult = "-1";

        //act
        String actualResult = new IsGoodBadPoorNumber().isGoodBadPoorNumber(M);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // M == 0
    @Test
    public void testZeroNum_Negative() {
        //AAA
        //arrange
        int M = 0;
        String expectedResult = "Zero is a multiple of every number";

        //act
        String actualResult = new IsGoodBadPoorNumber().isGoodBadPoorNumber(M);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
