public class SortingAlgorithmsRunner {
    public static void main(String[] args) {
        int len = 10000;

        System.out.println("Common array size: " + len + "\n");

        int[] intArr = SortingAlgorithms.getRandIntArr(len, 1, 10000);
        System.out.println(abbrev(SortingAlgorithms.printArr(intArr)));
        long time = System.currentTimeMillis();
        System.out.print("Insertion sorting... ");
        SortingAlgorithms.insertionSort(intArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(SortingAlgorithms.printArr(intArr)) + "\n");

        double[] doubleArr = SortingAlgorithms.getRandDoubleArr(len);
        System.out.println(abbrev(SortingAlgorithms.printArr(doubleArr)));
        time = System.currentTimeMillis();
        System.out.print("Selection sorting... ");
        SortingAlgorithms.selectionSort(doubleArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(SortingAlgorithms.printArr(doubleArr)) + "\n");

        String[] strArr = SortingAlgorithms.getRandStringArr(len);
        System.out.println(abbrev(SortingAlgorithms.printArr(strArr)));
        time = System.currentTimeMillis();
        System.out.print("Bubble sorting... ");
        SortingAlgorithms.bubbleSort(strArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(SortingAlgorithms.printArr(strArr)) + "\n");

        strArr = SortingAlgorithms.getRandStringArr(len, 1, 1);
        System.out.println(abbrev(SortingAlgorithms.printArr(strArr)));
        time = System.currentTimeMillis();
        System.out.print("Bubble sorting... ");
        SortingAlgorithms.bubbleSort(strArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(SortingAlgorithms.printArr(strArr)) + "\n");

        intArr = SortingAlgorithms.getRandIntArr(len);
        System.out.println(abbrev(SortingAlgorithms.printArr(intArr)));
        time = System.currentTimeMillis();
        System.out.print("Merge sorting... ");
        SortingAlgorithms.mergeSort(intArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(SortingAlgorithms.printArr(intArr)) + "\n");

        intArr = SortingAlgorithms.getRandIntArr(len, 25, 5000);
        System.out.println(abbrev(SortingAlgorithms.printArr(intArr)));
        time = System.currentTimeMillis();
        System.out.print("Quick sorting... ");
        SortingAlgorithms.quickSort(intArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(SortingAlgorithms.printArr(intArr)) + "\n");
    }

    private static String abbrev(String str) {
        int cutoff = 100;
        if (str.length() < cutoff)
            return str;
        return str.substring(0, cutoff) + "...";
    }
}