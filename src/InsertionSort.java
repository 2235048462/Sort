public class InsertionSort {
    public static void main ( String[] args ) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        array = insertionSort ( array );
        for (int i = 0; i < array.length; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ();
    }

    private static int[] insertionSort ( int[] array ) {
        int len = array.length;
        int preIndex, current;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    current = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = current;
                }
            }
        }
        /*for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = array[i];
            while (array[preIndex] > current && preIndex >= 0) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
                if (preIndex == -1) {
                    break;
                }
            }
            array[preIndex + 1] = current;
        }*/
        return array;
    }
}
