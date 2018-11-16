public class Main {
    /**
     * Swaps the values of an array arr at indexes i and j.
     * @param arr The array to modify.
     * @param i The index of the value to be moved to index j.
     * @param j The index of the value to be moved to index i.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints out the values of an array of integers, delimited by a comma.
     * @param arr The array to print.
     */
    public static String printArr(int[] arr) {
        String out = "";
        for (int i : arr)
            out += ", " + i;
        return out.substring(2);
    }

    /**
     * Creates an array of integers from 1 to len in random order.
     * @param len The length of the array.
     * @return Array of randomly sorted integers.
     */
    public static int[] getRandIntArr(int len) {
        int[] arr = new int[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int)(Math.random() * len);
            while (arr[randIdx] != 0) {
                randIdx = (int)(Math.random() * len);
            }
            arr[randIdx] = i;
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        long time = System.currentTimeMillis();
        System.out.print("Performing bubble sort... ");
        boolean swap = true;
        int swaps = 0;
        int comparisons = 0;
        for (int i = 0; swap; i++) {
            swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swap = true;
                    swaps++;
                }
            }
        }
        System.out.println("Done. (" + (System.currentTimeMillis() - time) + "ms)\nSwaps: " + swaps + ", Comparisons: " + comparisons);
    }

    public static void selectionSort(int[] arr) {
        long time = System.currentTimeMillis();
        System.out.print("Performing selection sort... ");
        int minIdx = 0;
        int swaps = 0;
        int comparisons = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, minIdx, i);
            swaps++;

        }
        System.out.println("Done. (" + (System.currentTimeMillis() - time) + "ms)\nSwaps: " + swaps + ", Comparisons: " + comparisons);
    }

    public static void insertionSort(int[] arr) {
        long time = System.currentTimeMillis();
        System.out.print("Performing insertion sort... ");
        int swaps = 0;
        int comparisons = 0;
        for (int i = 1; i < arr.length; i++) {
            comparisons++;
            for (int j = i - 1; j > 0 && arr[j] < arr[j - 1]; j--) {
                comparisons++;
                swaps++;
                swap(arr, j, j - 1);
            }
        }
        System.out.println("Done. (" + (System.currentTimeMillis() - time) + "ms)\nSwaps: " + swaps + ", Comparisons: " + comparisons);
    }
}