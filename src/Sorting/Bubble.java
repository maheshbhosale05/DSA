package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1,46,24,52,20,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1; i>=1; i--){
            boolean isSwapDid = false;
            for(int j=0; j<=i;j++){
                if(arr[j]>arr[j+1]){
                    isSwapDid = true;
                    Sorting.swap(arr,j,j+1);
                }
            }
            if(!isSwapDid) break;
        }
    }

}
