class Solution {
    public int findGCD(int[] nums) {
        int a=nums[0]; //min
        int b=nums[0]; //mix
        for(int data:nums){
            if(data<a) a=data;
            if(data>b) b=data;
        }
       
        // int a = nums[0];
        // int b = nums[nums.length - 1];

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;

    }
}