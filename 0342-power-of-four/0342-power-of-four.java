class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        if(n<=0)return false;
        double num=(double)n;
        while(num>4){
            num=num/4;
        }
        return num==4;
    }
}