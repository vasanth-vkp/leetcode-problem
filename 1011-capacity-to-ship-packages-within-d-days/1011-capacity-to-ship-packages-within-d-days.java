class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;

        for(int num:weights){
            low = Math.max(low, num);
            high+=num;
        }
        while (low<=high){       
            int dayr=1;
            int mid=low+(high-low)/2;
            int  currw8=0;
            int totalw8=0;
            for(int num:weights){
                if(currw8+num>mid){
                    dayr++;
                    currw8=num;
                }else{
                currw8=currw8+num;
                }
            }
            if(dayr<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}