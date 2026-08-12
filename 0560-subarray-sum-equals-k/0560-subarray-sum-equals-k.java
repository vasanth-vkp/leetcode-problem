class Solution {
    public int subarraySum(int[] nums, int k) {
     int n=nums.length;
     int l=0;
     for(int i=0;i<n;i++){
        int s=0;
        for(int j=i;j<n;j++){
            s=s+nums[j];
            if(s==k){
               l++;
            }
        }
    
        }
     return l;
    }
}