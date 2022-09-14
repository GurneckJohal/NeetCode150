class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        char[] str = s.toCharArray();
        int l = 0;
        int longest = 0;
        for(int r = 0; r < str.length; r++){
            while(hs.contains(str[r])){
                hs.remove(str[l]);
                l++;
            }
            hs.add(str[r]);
            longest = longest < r-l+1 ? r-l+1 : longest;
            
        }
        return longest;
    }
}
