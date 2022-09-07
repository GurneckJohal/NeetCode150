class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,String> hm = new HashMap<String,String>();
        HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
        int anagramIndex = 0;
        for(String s : strs){
            int[] letterCount = new int[26];
            char a = 'a';
            for(char c : s.toCharArray()){
                letterCount[c-a]++;
            }
            hm.put(s,Arrays.toString(letterCount));
            if(hm2.putIfAbsent(Arrays.toString(letterCount),anagramIndex) == null){
                anagramIndex++;
            }
        }
        List<List<String>> solution = new ArrayList<>();
        for(int i = 0; i < anagramIndex; i++){
            solution.add(new ArrayList<String>());
        }
        for(String s : strs){
            solution.get(hm2.get(hm.get(s))).add(s);
        }
        return solution;
    }
}
