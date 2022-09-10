class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1;
        while(numbers[p2] > target){
            p2--;
        }
        while(numbers[p1]+numbers[p2] != target){
            if(numbers[p1]+numbers[p2] > target){
                p2--;
            }
            else if(numbers[p1]+numbers[p2] < target){
                p1++;
            }
        }
        return new int[]{p1+1,p2+1};
    }
}
