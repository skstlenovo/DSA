class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength= 0;
        int l = 0;
        int r = 1;
        // if(s.isBlank()){
        //     return 1;
        // }
        if(s.length()==1){
            return 1;
        }
        while(l<s.length()-1){
            List<Character> subString =new ArrayList<>();
            char c = s.charAt(l);
            subString.add(c);
            r+= l;
            while(r<s.length() && c!=s.charAt(r) && !subString.contains(s.charAt(r))){
                subString.add(s.charAt(r));
                r++;
            }
            l++;
            r=1;
            maxLength = Math.max(maxLength,subString.size());
        }

        return maxLength;
        
    }
}