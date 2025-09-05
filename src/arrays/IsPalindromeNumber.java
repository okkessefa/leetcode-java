class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int l = 0;
        int r = str.length() -1;
        boolean isPolindrome= false;
        if(str.length() == 1){
            isPolindrome = true;
        }
        while(l<r){
            if(str.charAt(l) == str.charAt(r)){
                l++; r--;
                isPolindrome = true;
            }else{
                isPolindrome = false;
                break;
            }
        }
        return isPolindrome;
    }
}