class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
        if(s1.length() > s2.length()){
            return false;
        }
        for(int x = 0; x < s1.length();x++){
            hm1.put(s1.charAt(x),hm1.getOrDefault(s1.charAt(x),0)+1);
        }
        int l = 0;
        int r = s1.length();
        for(int x = 0; x < r; x++){
            hm2.put(s2.charAt(x),hm2.getOrDefault(s2.charAt(x),0)+1);
        }
        while(r < s2.length()){
            if(hm2.equals(hm1)){
                return true;
            }
            hm2.put(s2.charAt(r),hm2.getOrDefault(s2.charAt(r),0)+1);
            hm2.put(s2.charAt(l),hm2.get(s2.charAt(l))-1);
            if(hm2.get(s2.charAt(l)) == 0){
                hm2.remove(s2.charAt(l));
            }
            l++;
            r++;
        }
        return hm2.equals(hm1);
    }
}
