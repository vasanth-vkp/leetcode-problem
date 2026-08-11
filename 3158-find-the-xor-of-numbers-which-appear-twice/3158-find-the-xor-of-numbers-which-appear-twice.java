class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] arr=new int[map.size()];
        int i=0;
        for(int val:map.keySet()){
            if(map.get(val)>1){
                arr[i]=val;
                i++;
            }
        }
        int ans=arr[0];
        for(int j=1;j<arr.length;j++){
            ans=ans^arr[j];
        }
        return ans;
    }
}