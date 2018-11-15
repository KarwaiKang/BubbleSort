public class Runner {
    public static void main(String[] args) {
        System.out.println("Bubble Sort:");
        int[] arr = Main.getRandIntArr(25);
        Main.printArr(arr);
        Main.bubbleSort(arr);
        Main.printArr(arr);

        System.out.println("Selection Sort:");
        arr = Main.getRandIntArr(25);
        Main.printArr(arr);
        Main.selectionSort(arr);
        Main.printArr(arr);

        System.out.println("Insertion Sort:");
        arr = Main.getRandIntArr(25);
        Main.printArr(arr);
        Main.insertionSort(arr);
        Main.printArr(arr);
    }
}