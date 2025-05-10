package SortingAlgorithms;

public class InsertionSort{
    public void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++) {// start index 1, initial is always sored by itself
            // i is last    j doesnt reach
            // index of     the end of
            // sorted array  ----   elem j smaller j-1
            for(int j = i; j > 0 && array[j] < array[j-1]; j--) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }
}
