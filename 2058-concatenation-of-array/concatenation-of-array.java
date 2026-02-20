class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[] = new int[nums.length * 2];
        int index = 0;

        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);

        return ans;
    }
}