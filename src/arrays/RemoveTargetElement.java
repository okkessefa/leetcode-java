class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        if (n == 0) return 0;
       
        while(left<=right){
            if (nums[left] == val){
                // if detected swap the values
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                // and decrement the right indicate
                right--;
            }
            else {
                // else move 1 step to the right indicate
                left++;
            }
        }
        return left;
    }
}