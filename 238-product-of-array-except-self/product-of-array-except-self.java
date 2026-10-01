class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        int pre =1;
        int post =1;
        for(int i=0; i<n; i++){
            ans[i]= ans[i]*pre;
            ans[n-1-i]= ans[n-1-i]*post;
            pre= nums[i]*pre;
            post= nums[n-1-i]*post;
        }
        return ans;
    }
}