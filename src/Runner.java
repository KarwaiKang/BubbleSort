public class Runner {
    public static void main(String[] args) {
        int len = 10000;
        System.out.println("Common array size: " + len + "\n");

        int[] intArr = InPlaceSorts.getRandIntArr(len);
        System.out.println(abbrev(InPlaceSorts.printArr(intArr)));
        long time = System.currentTimeMillis();
        System.out.print("Insertion sorting... ");
        InPlaceSorts.insertionSort(intArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(InPlaceSorts.printArr(intArr)) + "\n");

        double[] doubleArr = InPlaceSorts.getRandDoubleArr(len);
        System.out.println(abbrev(InPlaceSorts.printArr(doubleArr)));
        time = System.currentTimeMillis();
        System.out.print("Selection sorting... ");
        InPlaceSorts.selectionSort(doubleArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(InPlaceSorts.printArr(doubleArr)) + "\n");

        String[] strArr = InPlaceSorts.getRandStringArr(len);
        System.out.println(abbrev(InPlaceSorts.printArr(strArr)));
        time = System.currentTimeMillis();
        System.out.print("Bubble sorting... ");
        InPlaceSorts.bubbleSort(strArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(InPlaceSorts.printArr(strArr)) + "\n");

        strArr = InPlaceSorts.getRandStringArr(len, 1, 1);
        System.out.println(abbrev(InPlaceSorts.printArr(strArr)));
        time = System.currentTimeMillis();
        System.out.print("Bubble sorting... ");
        InPlaceSorts.bubbleSort(strArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(InPlaceSorts.printArr(strArr)) + "\n");

        intArr = InPlaceSorts.getRandIntArr(len);
        System.out.println(abbrev(InPlaceSorts.printArr(intArr)));
        time = System.currentTimeMillis();
        System.out.print("Merge sorting... ");
        InPlaceSorts.mergeSort(intArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(InPlaceSorts.printArr(intArr)) + "\n");

        intArr = InPlaceSorts.getRandIntArr(len);
        System.out.println(abbrev(InPlaceSorts.printArr(intArr)));
        time = System.currentTimeMillis();
        System.out.print("Quick sorting... ");
        InPlaceSorts.quickSort(intArr);
        System.out.println("Done in " + (System.currentTimeMillis() - time) + "ms.");
        System.out.println(abbrev(InPlaceSorts.printArr(intArr)) + "\n");
    }

    private static String abbrev(String str) {
        int cutoff = 100;
        if (str.length() < cutoff)
            return str;
        return str.substring(0, cutoff) + "...";
    }
}