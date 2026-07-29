class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int freq=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            int a=map.get(n);
            if(a>freq){
                freq=a;
                max=n;
            }
        }
        return max;
    }
}