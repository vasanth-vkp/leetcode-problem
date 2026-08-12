class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxlen=Math.max(len,maxlen);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return maxlen;
    }
}