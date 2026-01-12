package Sorting;

import java.util.Arrays;

class MutableBoolean {
    public boolean value;

    public MutableBoolean(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}

public class BubbleRecursion {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int sortedPosition){
        if(sortedPosition == 1) return;
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        swap(arr, 0, sortedPosition, mutableBoolean);
        if(!mutableBoolean.value) {
            return;
        }
        bubbleSort(arr, sortedPosition-1);

    }

    public static void swap(int[] arr, int index, int sortedPosition, MutableBoolean mutableBoolean){
        if(index==sortedPosition-1) return;
        if(arr[index] > arr[index+1]){
            int temp = arr[index];
            arr[index] = arr[index+1];
            arr[index+1] = temp;
            mutableBoolean.value = true;
        }
        swap(arr,index+1,sortedPosition, mutableBoolean);
    }
}
