package Sorting;

import java.util.Arrays;

import static Sorting.Sorting.swap;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start<end){
            int partitionInx = pivotCorrectPosition(arr, start, end);
            quickSort(arr, start, partitionInx-1);
            quickSort(arr, partitionInx+1, end);
        }
    }
    public static int pivotCorrectPosition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j= end;

        while(i<j){
            while(arr[i]<= pivot && i<=end-1){
                i++;
            }
            while(arr[j]>pivot && j>= start-1){
                j--;
            }
            if(i<j) swap(arr, i, j);
        }
        swap(arr, start, j);
        return j;
    }

}
