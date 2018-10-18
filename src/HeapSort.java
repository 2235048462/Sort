public class HeapSort {
    public static void main ( String[] args ) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        array = heapSort ( array );
        for (int i = 0; i < array.length; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ();
    }

    private static int[] heapSort ( int[] array ) {
        // 构造大顶堆
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heap ( array, i, array.length );
        }
        // 调整堆结构,交换元素
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heap ( array, 0, i );
        }
        return array;
    }

    private static void heap ( int[] array, int currentIndex, int length ) {
        int temp = array[currentIndex]; // 取当前元素
        for (int i = currentIndex * 2 + 1; i < length; i = i * 2 + 1) {
            if (i + 1 < length && array[i] < array[i + 1]) {
                i++;
            }
            if (array[i] > temp) {
                array[currentIndex] = array[i];
                currentIndex = i;
            } else {
                break;
            }
        }
        array[currentIndex] = temp; // temp值放到最终位置
    }
}
