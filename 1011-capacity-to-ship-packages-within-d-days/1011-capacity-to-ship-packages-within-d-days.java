class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int weight : weights) {
            if (weight > left) {
                left = weight;
            }
            right += weight;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            int currentWeight = 0;
            int requiredDays = 1;
            for (int weight : weights) {

                if (currentWeight + weight > mid) {
                    requiredDays++;
                    currentWeight = weight;
                } else {
                    currentWeight += weight;
                }
            }
            if (requiredDays <= days) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}