package SortingAlgorithms;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] bubble_array = {1,2,14,19,134,32,0,5,30,17};
        int[] bubble_arrayClone = {1,2,14,19,134,32,0,5,30,17};

        int[] insertion_array = {10,9,13,203,506,3,0,6,1};
        int[] selection_array = {17,14,400,500,32,45,1,2,5,4,3,0};

        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();

        System.out.println("Array before bubble sort: \n" + Arrays.toString(bubble_array));

        bubble.gToSBubbleSort(bubble_array);
        System.out.println("Array after greatest to least bubble sort: \n" + Arrays.toString(bubble_array));

        bubble.sToGBubbleSort(bubble_arrayClone);
        System.out.println("Array after least to greatest bubble sort: \n" + Arrays.toString(bubble_arrayClone));

        System.out.println("Array before insertion sort: \n" + Arrays.toString(insertion_array));

        insertion.insertionSort(insertion_array);
        System.out.println("Array after insertion sort: \n" + Arrays.toString(insertion_array));

        System.out.println("Array before selection sort: \n" + Arrays.toString(selection_array));
        selection.selectionSort(selection_array);
        System.out.println("Array after selection sort: \n" + Arrays.toString(selection_array));

    }
}
