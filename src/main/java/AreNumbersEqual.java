public class AreNumbersEqual {

    public static int areNumbersEqual(int number1, int number2) {

        if (number1 == number2) {

            return 0;
        }
        if (number1 > number2) {

            return 1;
        }

        return -1;
    }

}
