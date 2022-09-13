class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int rain = 0;
        while(l<r){
            if(leftMax <= rightMax){
                l++;
                leftMax = (leftMax < height[l]) ? height[l] : leftMax;
                rain+= (leftMax - height[l]); 
            }
            else{
                r--;
                rightMax = (rightMax < height[r]) ? height[r] : rightMax;
                rain+= (rightMax - height[r]);
            }
        }
        return rain;
    }
}
