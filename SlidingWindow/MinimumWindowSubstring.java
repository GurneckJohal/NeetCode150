class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        int resLen = Integer.MAX_VALUE;
        if(t.length() > s.length()){
            return "";
        }
        HashMap<Character,Integer> window = new HashMap<Character,Integer>();
        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();
        for(int x = 0; x < t.length(); x++){
            tMap.put(t.charAt(x),tMap.getOrDefault(t.charAt(x),0)+1);
        }
        int have = 0;
        int need = tMap.size();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            
            if(tMap.containsKey(c) && (int)window.get(c) == (int)tMap.get(c)){
                have++;
            }
            
            while(have == need){
                if(result == "" || r-l+1 < result.length()){
                    result = s.substring(l,r+1);
                    resLen = result.length();
                }
                window.put(s.charAt(l),window.get(s.charAt(l))-1);
                if(tMap.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < tMap.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
        }
        return result;
        
    }
}

