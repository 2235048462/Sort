public class ShellSort {
    public static void main ( String[] args ) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        array = shellSort ( array );
        for (int i = 0; i < array.length; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ();
    }


    private static int[] shellSort ( int[] array ) {
        int len = array.length, nextIndex, temp;
        for (int gap = len / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < len; i++) {
                nextIndex = i;
                while (nextIndex - gap >= 0 && array[nextIndex] < array[nextIndex - gap]) {
                    temp = array[nextIndex];
                    array[nextIndex] = array[nextIndex - gap];
                    array[nextIndex - gap] = temp;
                    nextIndex--;
                }
            }
        }
        return array;
    }
}
