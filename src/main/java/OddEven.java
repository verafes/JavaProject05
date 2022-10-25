public class OddEven {

    /**
     * В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число,
     * возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
     */

    public static String oddEven(int n) {

        if (Math.abs(n % 2) == 1 ) {

            return "Odd";
        } else {

            return "Even";
        }

    }
}
