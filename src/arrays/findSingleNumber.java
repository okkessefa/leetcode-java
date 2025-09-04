import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        // CREATE A HASHTABLE 
        // add each new chracter into dic if it does not exist create a 
        //new value and set the key as 1
        // if it is exist increase the key by 1
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.contains(num)){
                seen.add(num);
            }    
        }
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int num_m : seen){
            table.put(num_m, 0);
        }
        for(int j = 0; j< nums.length; j++){
            if(table.containsKey(nums[j])){
                int Value = table.get(nums[j]) + 1;
                table.put(nums[j], Value);
            }
        }
        int minValue = Integer.MAX_VALUE;
        int minkey = 0;
        for(Map.Entry<Integer, Integer> entry : table.entrySet()){
            if(entry.getValue() < minValue){
                minValue = entry.getValue();
                minkey = entry.getKey();
            }
        }
        return minkey;
    }
}