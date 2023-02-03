import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int element1 = 8;
        int leftExcludeBound1 = 1, rightIncludeBound = 3;
        int[] subArray = getSubArray(array1, leftExcludeBound1, rightIncludeBound);
        System.out.println(Arrays.toString(subArray));
    }

    public static double getAverage(int[] array) {
        if (array.length == 0) {
            System.out.println("Нулевой массив");
            return -1;
        } else {
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            return ((double) sum / array.length);
        }
    }

    public static void getReverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
        }
    }

    public static int getIndexOfElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getSubArray(int[] array, int leftExcludeBound, int rightIncludeBound) {
        if (leftExcludeBound < 0 || rightIncludeBound > array.length) {
            throw new IllegalArgumentException();
        }

        int boundArray[] = new int[rightIncludeBound - leftExcludeBound];
        int j = 0;

        for (int i = leftExcludeBound; i < rightIncludeBound; i++) {
            boundArray[j] = array[i];
            j++;
        }

        return boundArray;
    }
}
