class Solution {

    private void reverse(int start, int end, int[] nums){

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
    public void rotate(int[] nums, int k) {
        
        int rotateIndex = k % nums.length;

        int mid = nums.length -1 -rotateIndex;

        reverse(0, mid, nums);
        reverse(mid+1, nums.length-1, nums);
        reverse(0, nums.length-1, nums);

    }
}

public class RotateArrayByKPosition{
    public static void main(String []args){
        Solution sl = new Solution();
        System.out.println(sl.rotate([1,2,3,4,5,6,7], 3));
    }
}