class Solution {
    public int ans(int nums[],int idx,int dp[]){
        if(idx == 0){
            return nums[0];
        }
        if(idx<0){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = nums[idx] + ans(nums,idx-2,dp);
        int skip = ans(nums,idx-1,dp);
        dp[idx] = Math.max(pick,skip);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return ans(nums,n-1,dp);
    }
}