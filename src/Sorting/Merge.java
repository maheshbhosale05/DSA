package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        int []arr= {3,1,2,4,1,5,2,6,4};
        merge(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static void merge(int[] arr,int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        sort(arr, low, mid, high);
    }

    public static void sort(int[] arr, int low, int mid, int high){
        int []tempArr = new int[high-low+1];
        int leftPointer =  low;
        int rightPointer = mid+1;
        int tempPointer = 0;
        while(leftPointer<=mid&&rightPointer<=high){
            if(arr[leftPointer]<=arr[rightPointer]){
                tempArr[tempPointer++]=arr[leftPointer++];
            }else{
                tempArr[tempPointer++]=arr[rightPointer++];
            }
        }
        while(leftPointer<=mid){
            tempArr[tempPointer++]=arr[leftPointer++];
        }
        while(rightPointer<=high){
            tempArr[tempPointer++]=arr[rightPointer++];
        }

        for (int i= low; i <= high; i++){
            arr[i] = tempArr[i-low];
        }
    }
}
