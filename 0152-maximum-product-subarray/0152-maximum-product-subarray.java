class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int [] max=new int[n];
        int[] min=new int[n];
        max[0]=nums[0];
        min[0]=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            int a=nums[i];
            int b=nums[i]*max[i-1];
            int c=nums[i]*min[i-1];
            max[i]=Math.max(a,Math.max(b,c));
            min[i]=Math.min(a,Math.min(b,c));
            ans=Math.max(ans,max[i]);
        }
        return ans;
    }
}