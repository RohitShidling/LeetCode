class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] temp = new int[Math.min(n1, n2)];
        int i = 0, j = 0, index = 0;

        while(i < n1 && j < n2) {

            if(nums1[i] == nums2[j]) {

                // avoid duplicates
                if(index == 0 || temp[index-1] != nums1[i]) {
                    temp[index++] = nums1[i];
                }

                i++;
                j++;

            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(temp, index);
    }
}