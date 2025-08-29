import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int temp : digits) {
            sb.append(temp); 
        }

        BigInteger number = new BigInteger(sb.toString());
        number = number.add(BigInteger.ONE);

        String newString = number.toString();

        int[] newDigits = new int[newString.length()];
        for (int i = 0; i < newString.length(); i++) {
            newDigits[i] = newString.charAt(i) - '0';
        }

        return newDigits;
    }
}
