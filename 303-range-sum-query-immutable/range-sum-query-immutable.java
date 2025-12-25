class NumArray {
    int prefixsum[];

    public NumArray(int[] nums) {
        prefixsum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixsum[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        int rightsum=prefixsum[right];
        int leftsum=(left>0)?prefixsum[left-1]:0;
        return rightsum-leftsum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */