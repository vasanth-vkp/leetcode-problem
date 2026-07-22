class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        if(n==1){
            return 1;
        }
        int count=0;
        int[][] dp=new int[n][n];
        for(int len = 1; len <= n; len++){
            for(int i = 0; i + len - 1 < n; i++){
                int j = i + len - 1;
                if(j==i){
                    dp[i][j]=1;
                    count++;
                }
                else if (j - i == 1 && s.charAt(i) == s.charAt(j)) {
                dp[i][j] = 2;
                count++;
                    }
                else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]!=0){
                    dp[i][j]=dp[i+1][j-1]+2;
                    count++;
                }
                else{
                    dp[i][j]=0;
                }

            }
        }
        return count;
    }
}