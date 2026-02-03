class Solution {
    public void moveZeroes(int[] nums) {
        int left = -1;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=0){
                left++;
                int temp=nums[left];
                nums[left]=nums[j];
                nums[j]=temp;
            }
                
        }
       
    }
}