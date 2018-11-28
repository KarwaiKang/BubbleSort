public class Team9SortCompetitionRunner {
    public static void main(String[] args) {
        int[] intArr = SortingAlgorithms.getRandIntArr(10000, 0, 10000);
        System.out.println(SortingAlgorithms.printArr(intArr));
        System.out.println("Median: " + Team9SortCompetition.challengeOne(intArr));

        String[] strArr = SortingAlgorithms.getRandStringArr(10000, 0, 5);
        String str = strArr[(int) (Math.random() * strArr.length)];
        System.out.println(SortingAlgorithms.printArr(strArr));
        System.out.println("Index of " + str + ": " + Team9SortCompetition.challengeTwo(strArr, str));

        intArr = SortingAlgorithms.getRandIntArr(100000, 0, 100000);
        System.out.println(SortingAlgorithms.printArr(intArr));
        System.out.println("Median: " + Team9SortCompetition.challengeThree(intArr));

        int[][] intArr2 = new int[1000][];
        for (int i = 0; i < intArr2.length; i++)
            intArr2[i] = SortingAlgorithms.getRandIntArr(1000, 0, 1000);
        // System.out.println(SortingAlgorithms.printArr(intArr2));
        System.out.println("Median: " + Team9SortCompetition.challengeFour(intArr2));

        Object[] objectArr = new Object[10000];
        // System.out.println(SortingAlgorithms.printArr(objectArr));
        System.out.println("Median: " + Team9SortCompetition.challengeFive(objectArr));
    }
}
