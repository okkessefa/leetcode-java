class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        int size = strs.length;
        if(strs.length == 0){
            return output;
        }
        else if(strs.length == 1){
            return  strs[0];
        }
        else{
            int minLength = Integer.MAX_VALUE;
            for (String s : strs) minLength = Math.min(minLength, s.length());
            for (int j = 0; j < minLength; j++) 
            {
                char c = strs[0].charAt(j);   // take reference char from first string
                for (int k = 1; k < size; k++) 
                {
                    if (strs[k].charAt(j) != c) 
                    {
                        return output;        // mismatch → stop immediately
                    }
                }
                output += c;                  // all matched → add once
            }
            return output;
        }
    }
}