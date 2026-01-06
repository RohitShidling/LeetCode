import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
        int[] arr3 = new int[nums1.length + nums2.length];
        
        
        for (int i = 0; i < nums1.length; i++) {
            arr3[i] = nums1[i];
        }
        
          int k = nums1.length;
        for (int j = 0; j < nums2.length; j++) {
            arr3[k++] = nums2[j];  
        }
        
        Arrays.sort(arr3);
        int size = arr3.length;
        
         if (size % 2 == 0) {
            int midIndex = size / 2;
            return (arr3[midIndex] + arr3[midIndex - 1]) / 2.0;  
        }
      
        else {
            return arr3[size / 2];
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
    
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(s.findMedianSortedArrays(arr1, arr2));  
    }
}
