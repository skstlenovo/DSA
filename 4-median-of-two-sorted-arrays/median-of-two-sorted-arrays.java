class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length+nums2.length;
        double ans =0.0;
        if(l%2==0){
            int j = l/2;
            int i=j-1;
            return median(nums1,nums2,i,j);
        }

        
        return median(nums1,nums2,l/2);
    }

    public double median(int[] nums1, int[] nums2, int i, int j){
           int p1 = 0, p2 = 0;
           int count = -1;
           int valI = 0, valJ = 0;
           
           while (p1 < nums1.length || p2 < nums2.length) {
            int next;
            if (p1 < nums1.length && (p2 >= nums2.length || nums1[p1] <= nums2[p2])) {
                next = nums1[p1++];
                } else {
                    next = nums2[p2++];
                    }
                    count++;
                    if (count == i) valI = next;
                    if (count == j) {
                        valJ = next;
                        break;
                        }
            }
                        return (valI + valJ) / 2.0;
    }
    public double median(int[] nums1, int[] nums2, int i){
        int p1 = 0, p2 = 0;
           int count = -1;
           int valI = 0, valJ = 0;
           
           while (p1 < nums1.length || p2 < nums2.length) {
            int next;
            if (p1 < nums1.length && (p2 >= nums2.length || nums1[p1] <= nums2[p2])) {
                next = nums1[p1++];
                } else {
                    next = nums2[p2++];
                    }
                    count++;
                    if (count == i){
                        valI = next;
                        break;
                    } 
                    
            }
                        return (double)valI;
    }

}