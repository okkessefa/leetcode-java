class Solution {
    public int[] sumZero(int n) {
        int[] r = new int[n];
        int idx = 0;
        if (n == 1){
            return new int[] {0};
        } 
        for(int i = 1; i< n/2+1; i++){
            r[idx++] = i;
            r[idx++] = -i;
        }
        if (n % 2 == 1) {
            r[idx] = 0;
        }
        return r;
    }
}