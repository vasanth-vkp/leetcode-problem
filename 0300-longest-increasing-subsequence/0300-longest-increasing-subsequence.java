import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        Vector<Integer> arr = new Vector<>();
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > arr.get(arr.size() - 1)) {
                arr.add(nums[i]);
            } else {
                int idx = lowerBound(arr, nums[i]);
                arr.set(idx, nums[i]);
            }
        }
        return arr.size();
    }
    private int lowerBound(Vector<Integer> arr, int target) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}