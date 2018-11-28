class SortingAlgorithms {
    /**
     * Swaps the values of an array arr at indexes i and j.
     *
     * @param arr the array to modify.
     * @param i   the index of the value to be moved to index j.
     * @param j   the index of the value to be moved to index i.
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
     * Prints out the values of an array, delimited by a space.
     *
     * @param arr the array to print.
     */
    static String printArr(int[] arr) {
        String out = "";
        StringBuilder sb = new StringBuilder(out);
        for (int i : arr)
            sb.append(" ").append(i);
        return sb.substring(1);
    }

    static String printArr(double[] arr) {
        String out = "";
        StringBuilder sb = new StringBuilder(out);
        for (double d : arr)
            sb.append(" ").append(d);
        return sb.substring(1);
    }

    static String printArr(String[] arr) {
        String out = "";
        StringBuilder sb = new StringBuilder(out);
        for (String s : arr)
            sb.append(" ").append(s);
        return sb.substring(1);
    }

    /**
     * Creates an array of {@code len} random integers
     * in the range [{@code min}, {@code max}].
     *
     * @param len the length of the array.
     * @param min the minimum integer value.
     * @param max the max integer value.
     * @return an array of randomly sorted integers.
     */
    static int[] getRandIntArr(int len, int min, int max) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = min + (int) (Math.random() * (max - min + 1));
        }
        return arr;
    }

    /**
     * Creates an array of integers from 1 to {@code len} in random order.
     *
     * @param len the length of the array.
     * @return an array of randomly sorted integers with no repeat values.
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
     * Creates an array of doubles from 1.0 to {@code len} in random order.
     *
     * @param len the length of the array.
     * @return an array of randomly sorted doubles.
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
     * Creates an array of Strings with random lowercase letters.
     *
     * @param num the length of the array.
     * @param min the minimum possible length of each String. (3 by default)
     * @param max the maximum possible length of each String. (5 by default)
     * @return an array of {@code num} Strings,
     * each of a length from {@code min} to {@code max},
     * composed of random lowercase letters.
     */
    static String[] getRandStringArr(int num, int min, int max) {
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            StringBuilder sb = new StringBuilder();
            int len = (int) (Math.random() * max + 1 - min) + min;
            for (int j = 0; j < len; j++)
                sb.append(Character.toString((char) ((Math.random() * 26) + 97)));
            arr[i] = sb.toString();
        }
        return arr;
    }

    static String[] getRandStringArr(int num) {
        return getRandStringArr(num, 3, 15);
    }

    /**
     * Bubble sort iterates through the list, swapping any out of order elements.
     * We continue iterating until no swaps are required. Then the array is sorted!
     *
     * @param list1 The array to sort.
     */
    static void bubbleSort(String[] list1) {
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
        System.out.print("(" + swaps + " swaps, " + comparisons + " comparisons) ");
    }

    /**
     * Selection sort finds the lowest element and mose it to the front of the array.
     * Then searches the rest of the array for the next element, and repeats.
     *
     * @param list1 The array to sort.
     */
    static void selectionSort(double[] list1) {
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
        System.out.print("(" + swaps + " swaps, " + comparisons + " comparisons) ");
    }

    /**
     * Insertion takes each element from the array,
     * and adds it to the front of the array in the correct order.
     * We need to keep track of where we are inserting elements as we sort.
     *
     * @param list1 The array to sort.
     */
    static void insertionSort(int[] list1) {
        int swaps = 0, comparisons = 0;
        for (int i = 1; i < list1.length; i++) {
            comparisons++;
            for (int j = i - 1; j > 0 && list1[j] < list1[j - 1]; j--) {
                comparisons++;
                swaps++;
                swap(list1, j, j - 1);
            }
        }
        System.out.print("(" + swaps + " swaps, " + comparisons + " comparisons) ");
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

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }
}