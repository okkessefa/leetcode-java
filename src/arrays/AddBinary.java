class Solution {
    public String addBinary(String a, String b) {
        int len_a = a.length() -1;
        int len_b = b.length() -1;
        
        String[] A = a.split("");
        String[] B = b.split("");

        int carry = 0;

        StringBuilder res = new StringBuilder();

        while(len_a >=0 || len_b >= 0){
            int x = (len_a>=0) ? Integer.parseInt(A[len_a--]) : 0;
            int y = (len_b>=0) ? Integer.parseInt(B[len_b--]) : 0;
            int temp =  carry + x + y;
            res.append(temp %2);
            carry = temp / 2;
        }
        if(carry >0) res.append(carry);
        res.reverse();
        
        return res.toString();

    }
}