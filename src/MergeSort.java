public class MergeSort {
    public static void main ( String[] args ) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        array = mergeSort ( array );
        for (int i = 0; i < array.length; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ();
    }

    private static int[] mergeSort ( int[] array ) {
        if (array.length > 0) {
            int len = array.length;
            doMergeSort ( array, 0, len - 1 );
        }
        return array;
    }

    private static void doMergeSort ( int[] array, int left, int right ) {
        int middle = (left + right) / 2;
        if (left < right) {
            doMergeSort ( array, left, middle );
            doMergeSort ( array, middle + 1, right );
            merge ( array, left, middle, right );
        }
    }

    private static void merge ( int[] array, int left, int middle, int right ) {
        int[] temp = new int[right - left + 1];
        int leftIndex = left, midIndex = middle + 1, index = 0;
        while (leftIndex <= middle && midIndex <= right) {
            if (array[leftIndex] < array[midIndex]) {
                temp[index++] = array[leftIndex++];
            } else {
                temp[index++] = array[midIndex++];
            }
        }
        while (leftIndex <= middle) {
            temp[index++] = array[leftIndex++];
        }
        while (midIndex <= right) {
            temp[index++] = array[midIndex++];
        }
        for (int i = 0; i < temp.length; i++) {
            array[i + left] = temp[i];
        } // 使用temp覆盖array中元素
    }

}
