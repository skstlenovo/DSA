class Solution {
    public int romanToInt(String s) {
        int num =0;
        for(int i=0;i<s.length();i++){
            int v1 =toInt(s.charAt(i));
            if(i+1<s.length()){
                int v2 =toInt(s.charAt(i+1));
                if(v1>=v2){
                    num+= v1;
                }else{
                    num+= (v2-v1);
                    i++;
                }
            }else{
                num+=v1;
            }

        }
        return num;
        
    }

    private int toInt(char c){
        return switch(c){
            case 'I'-> 1;
            case 'V'-> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}