class InPlaceSorts {
    /**
     * Swaps the values of an array arr at indexes i and j.
     *
     * @param arr The array to modify.
     * @param i   The index of the value to be moved to index j.
     * @param j   The index of the value to be moved to index i.
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
     *
     * @param arr The array to print.
     */
    static String printArr(int[] arr) {
        String out = "";
        for (int i : arr)
            out += ", " + i;
        return out.substring(2);
    }

    static String printArr(double[] arr) {
        String out = "";
        for (double i : arr)
            out += ", " + i;
        return out.substring(2);
    }

    static String printArr(String[] arr) {
        String out = "";
        for (String i : arr)
            out += ", " + i;
        return out.substring(2);
    }

    /**
     * Creates an array of integers from 1 to len in random order.
     *
     * @param len The length of the array.
     * @return Array of randomly sorted integers.
     */
    static int[] getRandIntArr(int len) {
        int[] arr = new int[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int) (Math.random() * len);
            while (arr[randIdx] != 0)
                randIdx = (int) (Math.random() * len);
            arr[randIdx] = i;
        }
        return arr;
    }

    /**
     * Creates an array of doubles from 1.0 to len in random order.
     *
     * @param len The length of the array.
     * @return Array of randomly sorted doubles.
     */
    static double[] getRandDoubleArr(int len) {
        double[] arr = new double[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int) (Math.random() * len);
            while (arr[randIdx] != 0)
                randIdx = (int) (Math.random() * len);
            arr[randIdx] = i;
        }
        return arr;
    }

    /**
     * Creates an array of Strings from "1" to len in random order.
     *
     * @param len The length of the array.
     * @return Array of randomly sorted Strings.
     */
    static String[] getRandStringArr(int len) {
        String[] arr = new String[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int) (Math.random() * len);
            while (arr[randIdx] != null)
                randIdx = (int) (Math.random() * len);
            arr[randIdx] = Integer.toString(i);
        }
        return arr;
    }

    /**
     * Creates an array of Strings with random lowercase letters.
     *
     * @param num The length of the array.
     * @param len The length of each String.
     * @return An array of num Strings, each of length len, composed of random lowercase letters.
     */
    static String[] randStringArr(int num, int len) {
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            String str = "";
            for (int j = 0; j < len; j++)
                str += Character.toString((char) ((Math.random() * 26) + 97));
            arr[i] = str;
        }
        return arr;
    }

    /**
     * Creates an array of Strings with random lowercase letters.
     *
     * @param num The length of the array.
     * @return An array of num Strings, each of a length from 3 to 15, composed of random lowercase letters.
     */
    static String[] randStringArr(int num) {
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            String str = "";
            int len = (int) (Math.random() * 13) + 3;
            for (int j = 0; j < len; j++)
                str += Character.toString((char) ((Math.random() * 26) + 97));
            arr[i] = str;
        }
        return arr;
    }

    /**
     * Bubble sort iterates through the list, swapping any out of order elements.
     * We continue iterating until no swaps are required. Then the array is sorted!
     *
     * @param list1 The array to sort.
     */
    static void bubbleSort(String[] list1) {
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
     *
     * @param list1 The array to sort.
     */
    static void selectionSort(double[] list1) {
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
     *
     * @param list1 The array to sort.
     */
    static void insertionSort(int[] list1) {
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

    /**
     * Sort an array of integers into ascending order.
     *
     * @param elements an array containing the items to be sorted.
     *                 <p>
     *                 Postcondition: elements contains its original items and items in elements
     *                 are sorted in ascending order.
     */
    static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    /**
     * Sorts elements[from] ... elements[to] inclusive into ascending order.
     *
     * @param elements an array containing the items to be sorted.
     * @param from     the beginning index of the items in elements to be sorted.
     * @param to       the ending index of the items in elements to be sorted.
     * @param temp     a temporary array to use during the merge process.
     *                 <p>
     *                 Precondition:
     *                 (elements.length == 0 or
     *                 0 <= from <= to <= elements.length) and
     *                 elements.length == temp.length
     *                 Postcondition: elements contains its original items and the items in elements
     *                 [from] ... <= elements[to] are sorted in ascending order.
     */
    private static void mergeSortHelper(int[] elements,
                                        int from, int to, int[] temp) {
        if (from < to) { // Checks if array length is at least 1
            int middle = (from + to) / 2; // Splits array in half
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    /**
     * Merges two adjacent array parts, each of which has been sorted into ascending
     * order, into one array part that is sorted into ascending order.
     *
     * @param elements an array containing the parts to be merged.
     * @param from     the beginning index in elements of the first part.
     * @param mid      the ending index in elements of the first part.
     *                 mid+1 is the beginning index in elements of the second part.
     * @param to       the ending index in elements of the second part.
     * @param temp     a temporary array to use during the merge process.
     *                 <p>
     *                 Precondition: 0 <= from <= mid <= to <= elements.length and
     *                 elements[from] ... <= elements[mid] are sorted in ascending order and
     *                 elements[mid + 1] ... <= elements[to] are sorted in ascending order and
     *                 elements.length == temp.length
     *                 Postcondition: elements contains its original items and
     *                 elements[from] ... <= elements[to] are sorted in ascending order and
     *                 elements[0] ... elements[from − 1] are in original order and
     *                 elements[to + 1] ... elements[elements.length − 1] are in original order.
     */
    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) { // While both halves still have elements to sort
            if (elements[i] < elements[j]) { // Puts the smaller number in temp first
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid) { // Puts the rest of the first half of array at end
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to) { // Puts the rest of the second half of array at end
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) { // Overwrites the original array
            elements[k] = temp[k];
        }
    }
}