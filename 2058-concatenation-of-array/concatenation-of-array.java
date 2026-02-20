class Solution {
    public int[] getConcatenation(int[] nums) {
        int newarr[] = new int[nums.length * 2];
        int index = 0;

        for (int i = 0; i < nums.length; i++, index++) {
            newarr[index] = nums[i];
        }

        for (int i = 0; i < nums.length; i++, index++) {
            newarr[index] = nums[i];
        }

        return newarr;
    }
}