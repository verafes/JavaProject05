public class SumArray {

    /**
     * Sum of array
     * @param array
     * @return sum
     */
    public static int sumArray(int[] array) {

        if (array.length > 0) {
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum;
        }

        return 0;
    }

}
