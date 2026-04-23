class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int area = 0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int w = r-l;
            int a = h*w;
            area = Math.max(a, area);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return area;
        
    }
}