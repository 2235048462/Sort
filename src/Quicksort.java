public class Quicksort {
    public static void main ( String[] args ) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        array = quickSort ( array );
        for (int i = 0; i < array.length; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ();
    }

    private static int[] quickSort ( int[] array ) {
        if (array.length > 0) {
            int len = array.length;
            doQuickSort ( array, 0, len - 1 );
        }
        return array;
    }

    private static void doQuickSort ( int[] array, int left, int right ) {
        if (left < right) {
            int middle = getMiddle ( array, left, right );
            doQuickSort ( array, left, middle - 1 );
            doQuickSort ( array, middle + 1, right );
        }
    }

    private static int getMiddle ( int[] array, int left, int right ) {
        int key = array[left];
        while (left < right) {
            while (left < right && array[right] > key) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] < key) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = key;
        return left;
    }
}
