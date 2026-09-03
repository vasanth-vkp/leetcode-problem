class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        if(nums.length==0)return 0;
        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int l=1;
                while(set.contains(n+l)){
                    
                    l++;
                }
                max=Math.max(l,max);
            }
        }
        return max;
    }
}