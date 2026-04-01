class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int data : nums) {
            pq.add(data);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}