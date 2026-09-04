class Solution {
    public boolean check(int[] nums) {
        outerLoop: 
        for(int i=0; i<nums.length; i++){
            int j= i+1;
            boolean isShorted = true;
            while(j!=i){
                if(j == nums.length -1 && nums[j] <= nums[0]){
                    j=0;
                }else if(nums[j] >= nums[j-1]){
                    j++;
                }else{
                    isShorted = false;
                    break;
                }
            }
            if(isShorted)   return true;
        }    
        return false;
    }
}

public class ArrayIsSortedandRotated{
    public static void main(String []args){
        Solution sl = new Solution();
        System.out.println(sl.check([3,4,5,1,2]));
    }
}