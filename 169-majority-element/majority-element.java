class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l = 1;
        int avg = nums.length/2;
        int ref = nums[0];
        int count = 1;
        int ans = nums[0];

        while(l<nums.length){
            if(count>avg){
                return ans;
            }else if(nums[l]== ref){
                count++;               
                l++;
            }else{
                ref =nums[l];
                ans = nums[l];
                count = 1;
                l++;
            }
        }
        return ans;
    }
}