class Solution {
    public int smallestNumber(int n) {
        int times = 1;

        while(n>1){
            n/=2;
            times+=1;
        }
        int output =(int) (Math.pow(2,times)-1);
        return output;  
    }
}