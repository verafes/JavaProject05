public class CountEvenOddValuesInArray {

    public static int[] countEvenOddValuesInArray(int [] array) {

        if (array.length > 0) {
            int evenCountVal = 0;
            int oddCountVal = 0;

            int [] arr = new int[2];

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenCountVal++;
                } else {
                    oddCountVal += 1;
                }
            }
            arr[0] = evenCountVal;
            arr[1] = oddCountVal;

            return arr;
        }

        return new int[]{};
    }

}
