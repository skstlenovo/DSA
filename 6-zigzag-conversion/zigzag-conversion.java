class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;  

        String ans = "";
        int r = 2*(numRows-1);
        int j=0;
        while(j<numRows){  
            int i=j;
            while(i<s.length()){
                ans=ans+s.charAt(i);
                int idx =(i+r)-(j*2);
                if(j!=0 && j!=numRows-1 && idx<s.length()){
                    ans=ans+s.charAt(idx);
                }
                i=i+r;
            }
           j++;
        }
        return ans;
    }
}