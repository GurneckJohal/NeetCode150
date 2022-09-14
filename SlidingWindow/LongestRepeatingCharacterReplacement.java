class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        char[] str = s.toCharArray();
        int maxWindow = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int r = 0; r < str.length; r++){
            hm.put(str[r],hm.getOrDefault(str[r],0)+1);
            int mostFrequent = 0;
            for(int value : hm.values()){
                if(value > mostFrequent){
                    mostFrequent = value;
                }
            }
            int windowSize = r-l+1;
            
            while(windowSize - mostFrequent > k){
                hm.put(str[l], hm.get(str[l])-1);
                l++;
                mostFrequent = 0;
                for(int value : hm.values()){
                    if(value > mostFrequent){
                        mostFrequent = value;
                    }
                }
                windowSize = r-l+1;
            }
            if(windowSize > maxWindow){
                maxWindow = windowSize;
            }
        }
        return maxWindow;
    }
}
