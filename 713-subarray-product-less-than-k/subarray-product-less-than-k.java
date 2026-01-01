class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int count=0;
        if (k <= 1) return 0;
        int i=0,j=0,p=1;
        while(j<arr.length){
            p*=arr[j];
            while(p>=k && i<=j){
                p/=arr[i];
                i++;
            }
            count+=(j-i+1);
            j++;
        }
        
        return count;
    }
}