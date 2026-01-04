class Solution {
    public String longestCommonPrefix(String[] strs) {
        String finalPrefix = "";
        if(strs.length == 1){
            return strs[0];
        }
        finalPrefix = strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            int maxLen = (finalPrefix.length()>strs[i].length())?strs[i].length():finalPrefix.length();
            String prefix="";
            while(j<maxLen){
                char c1 = strs[i].charAt(j);
                char c2 = finalPrefix.charAt(j);
                if(c1!=c2){
                    break;
                }
                prefix = prefix+c1;
                j++;
            }
            finalPrefix =prefix;
        }
        return finalPrefix;
        
    }
}