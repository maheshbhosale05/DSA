package Sorting;

import java.util.Arrays;

public class InsertionRecursion {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        insertionSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr, int sortedInx){
        if(sortedInx>=arr.length-1) return;
        swapLastElementToCorrectPosition(arr, sortedInx+1);
        insertionSort(arr, sortedInx+1);
    }

    public static void swapLastElementToCorrectPosition(int[] arr,  int lastInx){
        if(lastInx == 0) return ;
        if(arr[lastInx] < arr[lastInx-1]){
            int temp =  arr[lastInx];
            arr[lastInx] = arr[lastInx-1];
            arr[lastInx-1] = temp;
        }else{
            return;
        }
        swapLastElementToCorrectPosition(arr, lastInx-1);

    }
}
