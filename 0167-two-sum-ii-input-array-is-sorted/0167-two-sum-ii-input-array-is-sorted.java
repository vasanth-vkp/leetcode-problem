class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int right=n-1;
        while(low<right){
           int val=nums[low]+nums[right];
           if(val==target){
            int[] ans={low+1,right+1};
            return ans;
           }
           else if(val<target){
            low++;
           }
           else{
            right--;
           }
        }
        return new int[0];
    }
}