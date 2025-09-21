class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length -1;
        int most = 0;

        while(l<r){
            int w = r-l;
            int h = Math.min(height[l], height[r]);    
            if( height[l] < height[r]){
                l++;
            }else{
                r--;
            }
            most = Math.max(most, w*h);
        }
        return most;
    }
}