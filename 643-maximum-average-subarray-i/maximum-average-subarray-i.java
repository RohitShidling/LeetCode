class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = 0;

        int sum = 0, maxsum = Integer.MIN_VALUE;
        for (r = l; r < nums.length; r++) {
            sum = sum + nums[r];
            if (r - l + 1 == k) {
                maxsum = Math.max(maxsum, sum);
                sum -= nums[l];
                l++;
            }
        }
        return (double) maxsum / k;
    }
}