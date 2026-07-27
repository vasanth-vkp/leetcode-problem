class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                int ans=(nums[i]-1)*(nums[j]-1);
                max=Math.max(max,ans);
                }
            }
        }
        return max;
    }
}