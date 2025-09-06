class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0; // to check what is getting insrease
        int i = 0;
        int pivot = nums[0];
        int n = nums.length;
        while(i<n){
            if(counter == 0) pivot = nums[i];
            if(pivot == nums[i]){
                counter++;
            }else{
                counter--;
            }
            i++;
        }
        return pivot;
    }
}