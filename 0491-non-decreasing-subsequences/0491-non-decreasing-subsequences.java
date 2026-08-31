class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ls);
        return ls;
    }
    public void backtrack(int[] nums,int start,List<Integer>path,List<List<Integer>>ls){
        if(path.size()>=2){
            ls.add(new ArrayList<>(path));
        }
        Set<Integer>set=new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            if(path.isEmpty()||nums[i]>=path.get(path.size()-1)){
                set.add(nums[i]);
                path.add(nums[i]);
                backtrack(nums,i+1,path,ls);
                path.remove(path.size()-1);
            }
        }
    }
}