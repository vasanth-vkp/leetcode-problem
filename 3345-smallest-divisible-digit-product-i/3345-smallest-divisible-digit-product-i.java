class Solution {
    public int smallestNumber(int n, int t) {
        int ans=1;
        int dup=n;
        while(n>0){
            int temp=n%10;
            ans=temp*ans;
            n=n/10;
        }
        if(ans%t==0){
            return dup;
        }
        else{
           return smallestNumber(dup+1,t);
        }
       

    }
}