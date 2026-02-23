class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalsum=n*(n+1)/2;
        int actualsum=0;

        for(int data:nums){
            actualsum+=data;
        }

        return totalsum-actualsum;
    }
}