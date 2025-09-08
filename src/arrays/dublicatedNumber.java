import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isContainsDublicate = false;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.contains(num)){
                seen.add(num);
            }
            else{
               isContainsDublicate = true; 
            }
        }

        return isContainsDublicate;
    }
}