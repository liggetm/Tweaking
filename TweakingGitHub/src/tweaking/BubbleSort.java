package tweaking;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        
        final int[] unsortedArray = { 9, 7, 2, 3, 1, 4 };
        
        System.out.println("unsorted array = {" + Arrays.toString(unsortedArray) + "}");
        bubbleSort(unsortedArray);
        System.out.println("sorted array = {" + Arrays.toString(unsortedArray) + "}");
        
    }

    private static void bubbleSort(int[] unsortedArray) {
        int j = unsortedArray.length;
        while (j > 0) {
            sort(unsortedArray, j);
            j--;
        }
    }

    private static void sort(int[] unsortedArray, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            if (((i + 1) < arrayLength) && needsSwapped(unsortedArray[i], unsortedArray[(i + 1)])) {
                swap(unsortedArray, i, i + 1);
            }
        }
    }

    private static boolean needsSwapped(final int left, final int right) {
        return (left > right);
    }
    
    private static void swap(final int[] sourceArray, final int index1, final int index2) {
        final int tmp = sourceArray[index2];
        sourceArray[index2] = sourceArray[index1];
        sourceArray[index1] = tmp;
    }
    
}
