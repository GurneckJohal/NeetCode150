class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int num : nums){
            if(hm.get(num) != null){
                hm.put(num,(hm.get(num)+1));
            }
            else{
                hm.put(num,1);
            }
        }
        ArrayList<LinkedList<Integer>> counts = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            counts.add(new LinkedList<Integer>());
        }
        Integer[] uniqueNums = new Integer[hm.size()];
        hm.keySet().toArray(uniqueNums);
        for(int num: uniqueNums){
            counts.get(hm.get(num)).add(num);
        }
        int index = nums.length;
        ArrayList<Integer> solutionList = new ArrayList<Integer>();
        int saveK = k;
        while(k!=0 && index > 0){
            if(counts.get(index).size() != 0){
                for(int num : counts.get(index)){
                    solutionList.add(num);
                    k--;
                    if(k == 0){
                        break;
                    }
                }
                index--;
            }
            else{
                index--;
            }
        }
        int[] solution = new int[saveK];
        for(int x = 0; x < saveK; x++){
            
            solution[x] = solutionList.get(x);
        }
        return solution;
    }
}
