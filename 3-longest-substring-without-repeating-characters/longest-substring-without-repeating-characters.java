class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, left = 0, n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < n; r++) {
            char ch=s.charAt(r);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(s.charAt(r), r);
            maxLen = Math.max(maxLen, r - left + 1);
        }
        return maxLen;

    }
}