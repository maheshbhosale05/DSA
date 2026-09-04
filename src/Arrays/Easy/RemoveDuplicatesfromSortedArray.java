class Solution {
    public int removeDuplicates(int[] nums) {

        int pivot = nums[0];
        int index = 1;

        for(int i = 1; i< nums.length; i++){
            if(nums[i] != pivot){
                pivot=nums[i];
               nums[index] = nums[i];
               index++;
            }
        }

        return index;
        
    }
}

public class RemoveDuplicatesfromSortedArray{
    public static void main(String []args){
        Solution sl = new Solution();
        System.out.println(sl.check([0,0,1,1,1,2,2,3,3,4]));
    }
}