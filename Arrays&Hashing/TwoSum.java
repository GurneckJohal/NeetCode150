class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        int[] solution = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(hm.get(target-nums[i])!=null){
                solution = new int[]{i,hm.get(target-nums[i])};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return solution;
    }
}
