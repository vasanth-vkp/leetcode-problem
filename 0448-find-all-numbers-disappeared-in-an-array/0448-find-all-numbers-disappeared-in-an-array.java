class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer>ls=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Arrays.sort(nums);
        
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)){
                continue;
            }
            else{
                ls.add(i);
            }
        }
        return ls;
    }
}