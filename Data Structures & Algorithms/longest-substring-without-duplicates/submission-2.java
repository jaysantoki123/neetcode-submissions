class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            while(charSet.contains(s.charAt(i))) {
                charSet.remove(s.charAt(j));
                j++;
            }
            charSet.add(s.charAt(i));
            max = Math.max(max, i - j+1);
        }

        return max;
    }
}
