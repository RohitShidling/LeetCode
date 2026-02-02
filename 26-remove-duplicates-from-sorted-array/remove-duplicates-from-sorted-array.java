class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String args[]){
        int[] nums={0,0,1,1,2,3,5,5};
        Solution s=new Solution();
        int k=s.removeDuplicates(nums);

        for(int i=0;i<k;i++){
            System.out.println(nums[i]+" ");
        }


    }
}