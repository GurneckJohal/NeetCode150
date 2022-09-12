class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int p1 = 0;
        int p2 = height.length - 1;
        while(p2 > p1){
            int smaller = (height[p1] < height[p2]) ? height[p1] : height[p2];
            max = max < smaller * (p2-p1) ? smaller * (p2-p1) : max;
            if(height[p1] < height[p2]){
                 p1++;
            }
            else{
                 p2--;
            }
        }
        return max;
    }
}
