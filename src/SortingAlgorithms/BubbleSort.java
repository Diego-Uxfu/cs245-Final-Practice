package SortingAlgorithms;

public class BubbleSort {
    public void gToSBubbleSort(int array[]){
        int length = array.length;
        for (int i = 0; i < length - 1; i++) { // outer loop assures each index is checked
            for(int j = 0; j < length - 1 - i; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j]; // create reference var
                    array[j] = array[j+1]; // assign j+1 to j
                    array[j+1] = temp; // elem @ j+1 = temp now
                }
            }
        }
    }

    public void sToGBubbleSort(int array[]){
        int length = array.length;
        for (int i = 0; i < length - 1; i++) { // outer loop assures each index is checked
            for(int j = 0; j < length - 1 - i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j]; // create reference var
                    array[j] = array[j+1]; // assign j+1 to j
                    array[j+1] = temp; // elem @ j+1 = temp now
                }
            }
        }
    }
}
