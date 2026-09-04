class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
         for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}

public class MoveZeroes{
    public static void main(String []args){
        Solution sl = new Solution();
        System.out.println(sl.linearSearch([2, 3, 4, 5, 3], 3));
    }
}