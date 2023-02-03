public class ArrayUtils {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 5, 9};
        int element1 = 8;
        int x = getNumberOfElement(array1, element1);
        System.out.println(x);
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

    public static int getNumberOfElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }


}
