import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if(m == 0){
            return 0; // you can not find the thing that does not exist;
        }
        for(int i = 0; i<= n-m; i++){ //  i for moving on hatstack 
            int j = 0;                // j for moving on needle
            while(j< m && haystack.charAt(i+j) == needle.charAt(j)){
                j++; // increase the j if chars are getting matches
            }
            if (j == m )return i; // this condition could be occured if needle found
        }

        return -1; // not found

    }
}