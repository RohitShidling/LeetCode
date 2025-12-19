class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int min = Integer.MAX_VALUE;
        int n = arr.length, sum = 0;
        int left = 0;

        for (int r = 0; r < n; r++) {
            sum = sum + arr[r];
            while (sum >= target) {
                min = Math.min(min, r - left + 1);
                sum = sum - arr[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}