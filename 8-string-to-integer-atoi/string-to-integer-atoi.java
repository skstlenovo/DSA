class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0){
            return 0;
        }
        int j = 0;
        int count = 0;
        boolean negative =false;
        while(j<s.length() && (s.charAt(j)=='-'|| s.charAt(j)=='+')){
            count++;
            if(count>1){
                return 0;
            }
            j++;
        }

        long num=0;
        if(count==1 && s.charAt(0)=='-'){
            negative =true;
            s = s.substring(1);
        }else if(count==1){
            s = s.substring(1);
        }

        if(count==1 && s.length()==0){
            return 0;
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9' && num > Integer.MAX_VALUE){
                break;
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num= num*10+(s.charAt(i) -'0');
            }else if( num==0){
                return 0;
            }else{
                break;
            }
            
        }
        
        if(!negative&& num > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(negative && -num < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return negative ? -(int)num : (int)num;
    }
}