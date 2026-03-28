class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int prefixSum = 1, suffixSum = 1;
        for (int i = 0; i < n; i++) {
            if (prefixSum == 0)
                prefixSum = 1;
            if (suffixSum == 0)
                suffixSum = 1;

            prefixSum = prefixSum * nums[i];

            suffixSum = suffixSum * nums[n - i - 1];

            max = Math.max(max, Math.max(prefixSum, suffixSum));
        }

        return max;
    }
}