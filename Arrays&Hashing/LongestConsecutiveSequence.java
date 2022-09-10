class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num: nums){
            hs.add(num);
        }
        int longest = 0;
        for(int num: nums){
            if(!hs.contains(num-1)){
                int count = 0;
                int number = num;
                while(hs.contains(number)){
                    count++;
                    number++;
                }
                if(count > longest){
                  longest = count;
                }
            }
        }
        return longest;
    }
}
