class Solution {
    public static int solve(int[] nums,int start,int end){
        int next1 = 0;
        int next2 = 0;
        for(int i = end; i>=start; i--){
            int pick = nums[i] + next2;
            int skip = next1;

            int current = Math.max(pick,skip);

            next2 = next1;
            next1 = current;
        }
        
        return next1;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int case1 = solve(nums,0,n-2);
        int case2 = solve(nums,1,n-1);

        return Math.max(case1,case2);
    }
}