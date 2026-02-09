class Solution {
    public void reverseString(char[] s) {
        int len =s.length/2;
        int l = 0;
        int r = s.length-1;
        while(len>0){
            char ref = s[l];
            s[l]=s[r];
            s[r]=ref;
            l++;
            r--;
            len--;
        }
    }
}