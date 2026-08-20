class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])%2==0){
                ans=true;
            }
            else{
                ans=false;
                break;
            }

        }
        return ans;
    }
}