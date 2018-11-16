public class Runner {
    public static void main(String[] args) {
        int len = 10000;
        System.out.println("Size: " + len);

        int[] arr = Main.getRandIntArr(len);
        System.out.println(Main.printArr(arr).substring(0,100) + "...");

        int[] clone = arr.clone();
        Main.bubbleSort(clone);
        System.out.println(Main.printArr(clone).substring(0,100) + "...");

        clone = arr.clone();
        Main.selectionSort(clone);
        System.out.println(Main.printArr(clone).substring(0,100) + "...");

        clone = arr.clone();
        Main.insertionSort(clone);
        System.out.println(Main.printArr(clone).substring(0,100) + "...");
    }
}