import java.util.*;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder sb = new StringBuilder();

        // handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            sb.append("-");
        }

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        // integer part
        sb.append(n / d);
        long remainder = n % d;
        if (remainder == 0) {
            return sb.toString(); // no fractional part
        }

        sb.append(".");
        Map<Long, Integer> seen = new HashMap<>(); // remainder -> position in sb

        while (remainder != 0) {
            if (seen.containsKey(remainder)) {
                int pos = seen.get(remainder);
                sb.insert(pos, "(");
                sb.append(")");
                break;
            }

            seen.put(remainder, sb.length());

            remainder *= 10;
            sb.append(remainder / d);
            remainder %= d;
        }

        return sb.toString();
    }
}
