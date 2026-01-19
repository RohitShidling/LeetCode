class Solution {


    private void getPerms(int[] nums, int idx, List<List<Integer>> result) {

        // base case
        if (idx == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            result.add(perm);
            return;
        }

        for (int i = idx; i < nums.length; i++) {

            // swap
            swap(nums, idx, i);

            // recursive call
            getPerms(nums, idx + 1, result);

            // backtrack (swap back)
            swap(nums, idx, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getPerms(nums, 0, result);
        return result;
    }

}