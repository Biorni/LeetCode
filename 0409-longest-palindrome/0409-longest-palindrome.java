class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int counter = 0;
        boolean isOdd = false;
        
        for (int count : map.values()) {
            if ((count % 2) == 0) {
                counter += count;
            } else {
                counter += count - 1;
                isOdd = true;
            }
        }

        if (isOdd) 
            return counter + 1;

        return counter;
    }
}