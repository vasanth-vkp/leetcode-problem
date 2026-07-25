class Solution{
    public int lengthOfLIS(int[] nums){
        int[] arr=new int[nums.length];
        int len=0;

        for(int num:nums){
            int l=0,r=len;
            while(l<r){
                int mid=l+(r-l)/2;
                if(arr[mid]<num){
                    l=mid+1;
                }else{
                    r=mid;
                }
            }
            arr[l]=num;
            if(l==len){
                len++;
            }
        }

        return len;
    }
}