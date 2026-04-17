class Solution {
    public int reverse(int num){
        int rev =0;
        while(num>0){
            int rem =num%10;
            rev = rev*10 +rem;
            num =num/10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        boolean flag = false;
        Map<Integer,Integer> numsList = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int num =nums[i];
            int rev = reverse(num);
            
            int index = numsList.getOrDefault(num,-1);
            if(index!=-1){
                minDiff =Math.min(minDiff, Math.abs(i-index));

                if(minDiff==1) return 1;

                flag=true;
            }

            numsList.put(rev,i);
        
        }

        return flag ? minDiff : -1;
    }
}