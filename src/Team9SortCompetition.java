public class Team9SortCompetition {
    /**
     * challengeOne: Standard sort and process
     * Task: Sort the list and return the median.
     *
     * @param arr an array of 10,000 random integers between 0-10000
     * @return the median of the array.
     */
    static double challengeOne(int[] arr) {
        SortingAlgorithms.quickSort(arr);
        if (arr.length % 2 == 0)
            return (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        return (double) arr[arr.length / 2];
    }

    /**
     * challengeTwo: String sorting and searching
     * Task: Sort the list and determine if it contains a given string.
     *
     * @param arr an array of 10,000 random strings (strings will be of length 5).
     * @param str the string to search for.
     * @return the index of the first instance of {@code str}, or -1 if not found
     */
    static int challengeTwo(String[] arr, String str) {
        return -1;
    }

    /**
     * challengeThree: Mostly Sorted Big Array
     * Task: Sort the list and return the median.
     *
     * @param arr a mostly sorted array of 100,000 integers (>75% of elements are in the correct order).
     * @return the median of the array.
     */
    static int challengeThree(int[] arr) {
        return -1;
    }

    /**
     * challengeFour: Multi-Dimensional sorting
     * Task: Sort each sub-array and then sort the arrays by their median value.
     *
     * @param arr a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000.
     * @return the median of the median array.
     */
    static int challengeFour(int[][] arr) {
        return -1;
    }

    /**
     * challengeFive: Mystery Sort and Search
     * Task: Sort the array by the compareTo method, and determine if it contains the element given.
     *
     * @param arr an array of 10,000 objects that implement the comparable interface.
     * @return the position of the object, or -1 if not found.
     */
    static int challengeFive(Object[] arr/**/) {
        return -1;
    }
}
