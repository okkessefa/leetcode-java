class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int m = x % 10;
            x /= 10;
            // overflow checks BEFORE rev = rev*10 + digit
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && m > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && m < -8)) return 0;

            rev = ( rev * 10) + m;
        }
        return rev;
    }
}