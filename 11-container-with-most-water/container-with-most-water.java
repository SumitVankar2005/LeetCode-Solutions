class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0, j = height.length - 1;
        while(i < j) {
            int ht = Math.min(height[i],height[j]);
            int wd = j - i;
            int trappedWater = ht * wd;
            ans = Math.max(ans,trappedWater);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}