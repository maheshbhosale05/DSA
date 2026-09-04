class Solution {
    public void moveZeroes(int[] nums) {
        
        int pivot = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[pivot] = nums[i];
                pivot++;
            }
        }

        for(int i=pivot; i<nums.length; i++ ){
            nums[i] = 0;
        }
    }
}

public class MoveZeroes{
    public static void main(String []args){
        Solution sl = new Solution();
        System.out.println(sl.moveZeroes([0,1,0,3,12]));
    }
}