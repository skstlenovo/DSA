class Solution {
    public void rotate(int[] nums, int k) {
        // int [] ans = new int[nums.length];
        // int len= nums.length;
        // int i =len;
        // int idx = k%len;
        // int val = nums[0];
        // while(i>0){
        //     int ref=nums[idx];
        //     nums[idx]= val;
        //     val =ref;
        //     idx =(idx+k)%len;
        //     i--;
        // }
        int[] copyArr= nums.clone();
        for(int i=0;i<nums.length;i++){
            int idx = (i+k)%nums.length;
            nums[idx]=copyArr[i];
        }
    }
}