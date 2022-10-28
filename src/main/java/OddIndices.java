import java.util.Arrays;

import static project_utils.Utils.countEvenElements;
import static project_utils.Utils.countOddElements;


public class OddIndices {

    /**
     * Написать алгоритм OddIndices, который принимает массив целых чисел,
     * и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     *
     * @return
     */

    public static int[] oddIndices(int[] array) {

        int countOdd = array.length/2;  // length of new array

        if (array.length > 0) {

            int[] oddIndicesArray = new int[countOdd];
            for (int i = 1, j = 0; j < countOdd; i += 2) {

                // assign value of original arr item to new item
                oddIndicesArray[j] = array[i];
                j++;
            }

            return oddIndicesArray;
        }

        return new int[]{};
    }

}
