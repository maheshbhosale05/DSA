package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {1,46,24,52,20,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i=0; i<=arr.length-1; i++){
//            for(int j=i; j>=1; j--){
//                if(arr[j]<arr[j-1]){
//                    swap(arr,j,j-1);
//                }
//                else {
//                    break;
//                }
//            }
            int j = i;
            while(j>=1 && arr[j]<arr[j-1]){
                Sorting.swap(arr,j,j-1);
                j--;
            }
        }
    }
}
