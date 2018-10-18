public class RadixSort {
    public static void main ( String[] args ) {
        int[] array = {23,11,65,94,47,70,52,39,81};
        array = radixSort ( array );
        for (int i = 0; i < array.length; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ();
    }

    private static int[] radixSort ( int[] array ) {
        int max = array[0], digits = 0;
        int len = array.length;
        for (int i = 1; i < len - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        String string = String.valueOf ( max );
        digits = string.length (); // 只对正数合适
        if (digits > 0) {
            doRadixSort ( array, digits );
        }
        return array;
    }

    private static void doRadixSort ( int[] array, int digits ) {
        int len = array.length;
        int k = 0, n = 1, m = 1;
        int[][] temp = new int[10][len];
        int[] order = new int[10];
        while (m <= digits) {
            for (int i = 0; i < len; i++) {
                int lsd = ((array[i] / n) % 10);
                temp[lsd][order[lsd]] = array[i];
                order[lsd]++;
            }
            for (int i = 0; i < 10; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        array[k] = temp[i][j];
                        k++;
                    }
                }
                order[i] = 0;
            }
            n = n * 10;
            k = 0;
            m++;
        }
    }
}
