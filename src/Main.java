public class Main {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        String out = "";
        for (int i : arr)
            out += ", " + i;
        System.out.println(out.substring(2));
    }

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
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length - 1 && arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swap = true;
                }
            }
        }

    }

    public static void selectionSort(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, min, i);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ) {
            int newIdx = i;
            while (newIdx != 0 && arr[i] < arr[newIdx - 1])
                newIdx--;
            if (newIdx != i)
                swap(arr, i, newIdx);
            else
                i++;
        }
    }
}