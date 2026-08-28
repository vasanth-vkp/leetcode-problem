class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=1;i<=nums[n-1];i++){
            if(nums[0]%i==0 && nums[n-1]%i==0){
                ans=i;
            }
        }
        return ans;
        
    }
}