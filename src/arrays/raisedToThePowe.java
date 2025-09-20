public class Solution {
    public double myPow(double x, int n) {
        long e = n;                 // promote to long to avoid overflow on -Integer.MIN_VALUE
        if (e < 0) {
            x = 1.0 / x;            // x^(-e) = (1/x)^e
            e = -e;                 // safe now because e is long
        }
        double ans = 1.0;           // multiplicative identity
        while (e > 0) {
            if ((e & 1L) == 1L) {   // if current bit is 1, include this power
                ans *= x;
            }
            x *= x;                 // square the base: x, x^2, x^4, x^8, ...
            e >>= 1;                // shift exponent right by 1 (floor divide by 2)
        }
        return ans;
    }
}
