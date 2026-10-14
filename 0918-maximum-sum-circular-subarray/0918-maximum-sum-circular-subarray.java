
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int maxSum = nums[0];
        int maxCurrent = 0;

        int minSum = nums[0];
        int minCurrent = 0;

        for (int num : nums) {
            maxCurrent = Math.max(num, maxCurrent + num);
            maxSum = Math.max(maxSum, maxCurrent);

            minCurrent = Math.min(num, minCurrent + num);
            minSum = Math.min(minSum, minCurrent);

            totalSum += num;
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
