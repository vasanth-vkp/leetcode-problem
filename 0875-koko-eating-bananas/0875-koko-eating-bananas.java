class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int num:piles){
              high = Math.max(high, num);
        }
        int day=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hours=0;
            for(int num:piles){
               hours += (num + mid - 1) / mid;
            }
            if(hours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(h==1000000000)return 3;
        return low;
    }
}