class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int avg=0;
        int count =0;
        int n=arr.length;
        for(int r=0;r<n;r++){
            avg=avg+arr[r];
            if(r-l+1==k){
                if(avg/k>=threshold){
                    count++;
                }
                avg -= arr[l]; 
                l++;
                
            }
            
        }
        return count;
    }
}