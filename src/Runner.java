public class Runner {
    public static void main(String[] args) {
        int len = 10000;
        System.out.println("Common array size: " + len + "\n");

        int[] intArr = InPlaceSorts.getRandIntArr(len);
        System.out.println("Random int array:");
        System.out.println(abbreviate(InPlaceSorts.printArr(intArr)));
        InPlaceSorts.insertionSort(intArr);
        System.out.println("Sorted:");
        System.out.println(abbreviate(InPlaceSorts.printArr(intArr)));

        double[] doubleArr = InPlaceSorts.getRandDoubleArr(len);
        System.out.println("Random double array:");
        System.out.println(abbreviate(InPlaceSorts.printArr(doubleArr)));
        InPlaceSorts.selectionSort(doubleArr);
        System.out.println("Sorted:");
        System.out.println(abbreviate(InPlaceSorts.printArr(doubleArr)));

        String[] stringArr = InPlaceSorts.getRandStringArr(len);
        System.out.println("Random String array:");
        System.out.println(abbreviate(InPlaceSorts.printArr(stringArr)));
        InPlaceSorts.bubbleSort(stringArr);
        System.out.println("Sorted:");
        System.out.println(abbreviate(InPlaceSorts.printArr(stringArr)));

        stringArr = InPlaceSorts.getRandStringArr(len, 1, 1);
        System.out.println("Random String array:");
        System.out.println(abbreviate(InPlaceSorts.printArr(stringArr)));
        InPlaceSorts.bubbleSort(stringArr);
        System.out.println("Sorted:");
        System.out.println(abbreviate(InPlaceSorts.printArr(stringArr)));

        intArr = InPlaceSorts.getRandIntArr(len);
        System.out.println("Random int array:");
        System.out.println(abbreviate(InPlaceSorts.printArr(intArr)));
        InPlaceSorts.mergeSort(intArr);
        System.out.println("Sorted:");
        System.out.println(abbreviate(InPlaceSorts.printArr(intArr)));
    }

    private static String abbreviate(String str) {
        if (str.length() < 150)
            return str;
        return str.substring(0, 150) + "...";
    }
}