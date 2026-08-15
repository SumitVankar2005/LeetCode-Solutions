class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i<n; i++){
            ans[i] = 1;
        }

        int prefix = 1;

        for(int i = 0; i<n; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;

        for(int j = n-1; j>=0; j--){
            ans[j] *= suffix;
            suffix *= nums[j];
        }

        return ans;
    }
}