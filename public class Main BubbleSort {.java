public class BubbleSort {
    public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex) {
        int temp = arrayToSwap[lowerIndex];
        arrayToSwap[lowerIndex] = arrayToSwap[lowerIndex + 1];
        arrayToSwap[lowerIndex + 1] = temp;
        return arrayToSwap;
    }
    // Print array helper
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array:");
        printArray(arr);
        boolean doSwap = true;
        while (doSwap) {
            doSwap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    arr = swapTwoArrayElements(arr, i);
                    doSwap = true; // found a swap, keep looping
                }
            }
        }
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
