package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {1,46,24,52,20,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void selectionSort(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            int minInx = i;
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[j] < arr[i]){
                    minInx = j;
                }
            }
            Sorting.swap(arr,i,minInx);
        }
    }
}
