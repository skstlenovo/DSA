class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxLength= 0;
        // int l = 0;
        // int r = 1;
        // if(s.length()==1){
        //     return 1;
        // }
        // while(l<s.length()-1){
        //     List<Character> subString =new ArrayList<>();
        //     char c = s.charAt(l);
        //     subString.add(c);
        //     r+= l;
        //     while(r<s.length() && c!=s.charAt(r) && !subString.contains(s.charAt(r))){
        //         subString.add(s.charAt(r));
        //         r++;
        //     }
        //     l++;
        //     r=1;
        //     maxLength = Math.max(maxLength,subString.size());
        // }
        // return maxLength;  

        Set<Character> set = new HashSet<>();
        int l = 0, r = 0, maxLength = 0;

        while (r < s.length()) {
            char current = s.charAt(r);

            if (!set.contains(current)) {
                set.add(current);
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }

        return maxLength; 
    }
}