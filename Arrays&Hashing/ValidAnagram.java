class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char i : s.toCharArray()){
            int count = hm.getOrDefault(i,0);
            hm.put(i,++count);
        }
        HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
        for(char i : t.toCharArray()){
            int count = hm2.getOrDefault(i,0);
            hm2.put(i,++count);
        }
        return hm.equals(hm2);
        
    }
}
