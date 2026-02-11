class Solution {
    public int reverse(int x) {
        StringBuilder num = new StringBuilder(""+x);
        boolean isNegative = x<0;
        if(isNegative){
            num.deleteCharAt(0);
        }
        num.reverse();
        long y = Long.valueOf(num.toString());
        if(isNegative){
            y=-y;
        }
        if(y>Integer.MAX_VALUE || y<Integer.MIN_VALUE){
            return 0;
        }
        return (int)y;
    }
}