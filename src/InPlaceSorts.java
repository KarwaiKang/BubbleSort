public class InPlaceSorts {
    /**
     * Swaps the values of an array arr at indexes i and j.
     * @param arr The array to modify.
     * @param i The index of the value to be moved to index j.
     * @param j The index of the value to be moved to index i.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints out the values of an array, delimited by a comma.
     * @param arr The array to print.
     */
    public static String printArr(int[] arr) {
        String out = "";
        for (int i : arr)
            out += ", " + i;
        return out.substring(2);
    }

    public static String printArr(double[] arr) {
        String out = "";
        for (double i : arr)
            out += ", " + i;
        return out.substring(2);
    }

    public static String printArr(String[] arr) {
        String out = "";
        for (String i : arr)
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
            while (arr[randIdx] != 0)
                randIdx = (int)(Math.random() * len);
            arr[randIdx] = i;
        }
        return arr;
    }

    /**
     * Creates an array of doubles from 1.0 to len in random order.
     * @param len The length of the array.
     * @return Array of randomly sorted doubles.
     */
    public static double[] getRandDoubleArr(int len) {
        double[] arr = new double[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int)(Math.random() * len);
            while (arr[randIdx] != 0)
                randIdx = (int)(Math.random() * len);
            arr[randIdx] = i;
        }
        return arr;
    }

    /**
     * Creates an array of String from "1" to len in random order.
     * @param len The length of the array.
     * @return Array of randomly sorted Strings.
     */
    public static String[] getRandStringArr(int len) {
        String[] arr = new String[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int)(Math.random() * len);
            while (arr[randIdx] != null)
                randIdx = (int)(Math.random() * len);
            arr[randIdx] = Integer.toString(i);
        }
        return arr;
    }

    /**
     * Bubble sort iterates through the list, swapping any out of order elements.
     * We continue iterating until no swaps are required. Then the array is sorted!
     * @param list1 The array to sort.
     */
    public static void bubbleSort(String[] list1) {
        long time = System.currentTimeMillis();
        System.out.print("Performing bubble sort... ");
        int swaps = 0, comparisons = 0;
        boolean swap = true;
        for (int i = 0; swap; i++) {
            swap = false;
            for (int j = 0; j < list1.length - i - 1; j++) {
                comparisons++;
                if (list1[j].compareTo(list1[j + 1]) > 0) {
                    swap(list1, j, j + 1);
                    swap = true;
                    swaps++;
                }
            }
        }
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms. \nSwaps: " + swaps + " | Comparisons: " + comparisons);
    }

    /**
     * Selection sort finds the lowest element and mose it to the front of the array.
     * Then searches the rest of the array for the next element, and repeats.
     * @param list1 The array to sort.
     */
    public static void selectionSort(double[] list1) {
        long time = System.currentTimeMillis();
        System.out.print("Performing selection sort... ");
        int swaps = 0, comparisons = 0;
        int minIdx = 0;
        for (int i = 0; i < list1.length - 1; i++) {
            for (int j = i; j < list1.length; j++) {
                comparisons++;
                if (list1[j] < list1[minIdx])
                    minIdx = j;
            }
            swap(list1, minIdx, i);
            swaps++;

        }
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.\nSwaps: " + swaps + " | Comparisons: " + comparisons);
    }

    /**
     * Insertion takes each element from the array,
     * and adds it to the front of the array in the correct order.
     * We need to keep track of where we are inserting elements as we sort.
     * @param list1 The array to sort.
     */
    public static void insertionSort(int[] list1) {
        long time = System.currentTimeMillis();
        System.out.print("Performing insertion sort... ");
        int swaps = 0, comparisons = 0;
        for (int i = 1; i < list1.length; i++) {
            comparisons++;
            for (int j = i - 1; j > 0 && list1[j] < list1[j - 1]; j--) {
                comparisons++;
                swaps++;
                swap(list1, j, j - 1);
            }
        }
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.\nSwaps: " + swaps + " | Comparisons: " + comparisons);
    }
}