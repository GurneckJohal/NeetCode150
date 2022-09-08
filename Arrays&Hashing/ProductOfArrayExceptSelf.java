class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] solution = new int[nums.length];
        Arrays.fill(solution,1);
        for(int i = 1; i < nums.length; i++){
            solution[i]*=(nums[i-1]*solution[i-1]);
        }
        int postfix = 1;
        for(int j = nums.length-2; j >= 0; j--){
            postfix*=nums[j+1];
            solution[j]*=postfix;
            
        }
        return solution;
    }
}
