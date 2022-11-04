import java.util.Arrays;

public class SortArray {

    /**
     * Bubble sorting of array
     * @param array with positive/negative ints
     * @return sorted array
     */
    public static int [] bubbleSortArray(int[] array) {

        int tmp;

        if (array != null && array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] > array[j]) {
                        tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }

            return array;
        }

        return new int[]{};
    }

    /**
     * Bubble sorting of array
     */
    public static int [] bubbleSort(int[] array) {

        if (array != null && array.length > 0) {
            boolean isSorted = false;

            while (!isSorted) {

                isSorted = true;

                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]) {
                        int tmp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tmp;

                        isSorted = false;
                    }
                }
//                System.out.println(" ! " + isSorted);
            }

            return array;
        }

        return new int[]{};
    }

    /**
     * Selection sorting of array
     */
    public static int [] selectionSortArray(int[] array) {

        // verify if array is not empty or null
        if (array != null || array.length > 0) {

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < array.length; i++) {

                // Find the minimum element in unsorted array
                int min = array[i];
                int minId = i;

                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minId = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = array[i];
                array[i] = min;
                array[minId] = temp;
            }

            return array;
        }

        return new int[]{};
    }

    /**
     * Inner sorting of array
     */
    public static int[] innerSort(int[] array) {

        // verify if array is not empty or null
        if (array != null || array.length > 0) {

            for (int i = 1; i < array.length; i++) {
                int x = array[i];
                int j = i;

                while (j > 0 && array[j - 1] > x) {
                    array[i] = array[i - 1];
                    --j;
                }
                array[j] = x;
            }

            return array;
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 48, 74, 55, 36};
        long start = 0;
        long end = 0;

        start = System.nanoTime();
        bubbleSortArray(array);
        end = System.nanoTime();
        System.out.println(end-start + " ms - bubbleSortArray (2 for)" + Arrays.toString(array));
        System.out.println();

        start = System.nanoTime();
        bubbleSort(array);
        end = System.nanoTime();
        System.out.println(end-start + " ms - bubbleSort (while) " + Arrays.toString(array));
        System.out.println();

        start = System.nanoTime();
        selectionSortArray(array);
        end = System.nanoTime();
        System.out.println(end-start + " ms - selectionSortArray " + Arrays.toString(array));
        System.out.println();


        start = System.nanoTime();
        innerSort(array);
        end = System.nanoTime();
        System.out.println(end-start + " ms - innerSort (while) " + Arrays.toString(array));
        System.out.println();
    }

}
