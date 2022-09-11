class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<Integer>();
        List<List<Integer>> triplets = new ArrayList<>();
        for(int x = 0; x < nums.length; x++){
            if(hs.add(nums[x])){
                if((nums.length - 1) - x >= 2){
                    int p1 = x+1;
                    int p2 = nums.length - 1;
                    while(p2 > p1){
                        if(nums[x] + nums[p1] + nums[p2] == 0){
                            ArrayList<Integer> list = new ArrayList<Integer>();
                            list.add(nums[x]);
                            list.add(nums[p1]);
                            list.add(nums[p2]);
                            triplets.add(list);
                            p1++;
                            while(nums[p1] == nums[p1-1] && p2 > p1){
                                p1++;
                            }
                        }
                        else if(nums[x] + nums[p1] + nums[p2] > 0){
                            p2--;
                        }
                        else if(nums[x] + nums[p1] + nums[p2] < 0){
                            p1++;
                        }
                    }
                }
            }
        }
        return triplets;
    }
}
