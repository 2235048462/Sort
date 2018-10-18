public class BubbleSort {
    public static void main ( String[] args ) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        array = bubbleSort ( array );
        for (int i = 0; i < array.length; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ();
    }

    private static int[] bubbleSort ( int[] array ) {
        int len = array.length;
        boolean flag; //是否交换
        for (int i = 0; i < len - 1; i++) {
            flag = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) { //相邻元素两两比较
                    int temp = array[j + 1]; //元素交换
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return array;
    }
}
