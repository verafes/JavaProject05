public class SumOfTwo {

    public static int[][] sumOfTwo(int[] array, int sum) {

        if (array != null && array.length > 0) {
            int count = 0;
            int[] copyArray = array;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum && (array[i] != sum || array[j] != sum)) {
                        count++;
                        int[] temp = new int[array.length - 2];
                        for (int l = 0, k = 0; l < array.length; l++) {
                            if (l != i && l != j) {
                                temp[k] = array[l];
                                if (k < temp.length - 1) {
                                    k++;
                                }
                            }
                        }
                        array = temp;
                        i = 0;
                        break;
                    }
                }
            }
            int[][] sumOfTwo = new int[count][2];
            for (int i = 0, s = 0; i < copyArray.length - 1; i++) {
                for (int j = i + 1; j < copyArray.length; j++) {
                    if (copyArray[i] + copyArray[j] == sum && (copyArray[i] != sum || copyArray[j] != sum)) {
                        sumOfTwo[s][0] = copyArray[i];
                        sumOfTwo[s][1] = copyArray[j];
                        if (s < count - 1) {
                            s++;
                        }
                        int[] temp = new int[copyArray.length - 2];
                        for (int l = 0, k = 0; l < copyArray.length; l++) {
                            if (l != i && l != j) {
                                temp[k] = copyArray[l];
                                if (k < temp.length - 1) {
                                    k++;
                                }
                            }
                        }
                        copyArray = temp;
                        i = 0;
                        break;
                    }
                }
            }

            return sumOfTwo;
        } else {

            return new int[0][0];
        }
    }

    public static int[][] sumOfTwo2(int[] array, int sum) {

        if (array != null && array.length > 0) {

            int[] b = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                b[i] = array[i];
            }
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (sum == (array[i] + array[j])) {
                        count++;
                        array[i] = -2147483648;
                        array[j] = -2147483648;

                    }
                }
            }

            int[][] sumOfTwo = new int[count][2];

            count = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (sum == b[i] + b[j]) {
                        sumOfTwo[count][0] = b[i];
                        sumOfTwo[count][1] = b[j];
                        count++;
                        b[i] = -2147483648;
                        b[j] = -2147483648;
                    }
                }
            }

            return sumOfTwo;
        }

        return new int[][]{};
    }

}
