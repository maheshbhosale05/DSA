import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,46,24,52,20,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            int minInx = i;
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[j] < arr[i]){
                    minInx = j;
                }
            }
            swap(arr,i,minInx);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1; i>=1; i--){
            boolean isSwapDid = false;
            for(int j=0; j<=arr.length-2 ;j++){
                if(arr[j]>arr[j+1]){
                    isSwapDid = true;
                    swap(arr,j,j+1);
                }
            }
            if(!isSwapDid) break;
        }
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
                swap(arr,j,j-1);
                j--;
            }
        }
    }
}
