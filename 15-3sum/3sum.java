class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    // System.out.println("I:"+nums[i]+" L:"+nums[left]+" R:"+nums[right]);
                    result.add(List.of(nums[i],nums[left],nums[right]));
                    // System.out.println("Visited: i:"+i+" l:"+left+" j:"+right+" "+result);
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
            while(i<nums.length-2 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return result;
        
    }
}