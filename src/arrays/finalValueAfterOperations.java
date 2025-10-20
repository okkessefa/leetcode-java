class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // define finalValue = 0;
        // traver the array with for loop
        // index j=0;
        //while j<=2 get the elemeents of i and 
        // if it is X continue;
        // else if "+" increase the finalValue by 1  and break;
        // else decrease the final value by one and break;  
        int finalValue = 0;
        for(int i = 0; i<operations.length; i++)
        {
            String temp = operations[i];
            for(int j = 0; j<=2;j++)
            {
                if(temp.charAt(j) == 'X') continue;
                else if(temp.charAt(j) == '+') {
                    finalValue++;
                    break;
                }
                else {
                    finalValue--;
                    break;
                }
            }
        }
        return finalValue;
    }
}