class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int timer = 0;
        int n = nums.length;
        if(k<=0 || k>n) return new int[0];
        int window = n-k+1;
        int[] answer = new int[window]; 
        int[] temp = new int[k]; // holding the values from scaling window 
        for(int start = 0; start<window;start++)
        {
            // 1-) copy the subsets
            for(int i =start; i<start+k;i++)
            {
                temp[i-start] = nums[i]; // scaling the window by copying the values in order to windows size
            }
            // 2-) sort the array
            Arrays.sort(temp);
            
            // 3-) Run the decode -> val[], count[]
            int[] vals = new int[k];
            int[] cnts = new int[k];
            
            int u = 0; // number of distinct values in array
            
            int i = 0; // timer
            while(i<k){
                int v = temp[i]; // selecitng the temp value to compare
                int j = i+1; // help to move timer next value
                while(j<k && temp[j] == v) j++;
                vals[u] = v; // assinging the key
                cnts[u] = j-i; // and its frequency
                u++;
                i = j; // updating the timer
            }
            // 4-) picking top x by (count , value) using lineer search
            long sum =0L;
            int pick = Math.min(x, u);
            for(int t = 0; t<pick; t++){
                int bestIdx = -1;
                int bestCnt = -1;
                int bestVal = Integer.MIN_VALUE;
                for(int idx = 0; idx<u; idx++){
                    int c = cnts[idx];
                    if(c<0) continue;
                    int v = vals[idx];
                    if(c > bestCnt || (c == bestCnt && v > bestVal)){
                        bestCnt = c;
                        bestVal = v;
                        bestIdx = idx;
                    }
                }
                sum +=  (long) (bestCnt * bestVal);
                cnts[bestIdx] = -1;
            }
            answer[start] = (int) sum;
        }
        return answer;
    }
}