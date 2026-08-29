class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ls=new ArrayList<>();
        
        while(left<=right){
            int n=left;
            boolean valid=true;
            while(n>0){
                int k=n%10;
                if(k==0||left%k!=0){
                    valid=false;
                    break;
                }

                n=n/10;
            }
            if(valid){
                ls.add(left);
            }
            left++;
        }
        return ls;
    }
}