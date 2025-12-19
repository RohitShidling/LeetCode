class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum = 0, rsum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            lsum = lsum + arr[i];
        }

        maxSum = lsum;
        int rightIndex = arr.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - arr[i];
            rsum = rsum + arr[rightIndex];
            rightIndex--;

            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }
}