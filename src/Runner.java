public class Runner {
    public static void main(String[] args) {
        int[] arr = Main.getRandIntArr(25);
        Main.printArr(arr);
        Main.insertionSort(arr);
        Main.printArr(arr);
    }
}