class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        return max==Integer.MIN_VALUE?0:max;

    }
}