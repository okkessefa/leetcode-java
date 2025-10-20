class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // Define finalValue = 0.
        // Traverse the array with a for loop.
        // For each string, scan its characters.
        // If you see 'X', continue.
        // If you see '+', increment finalValue and break.
        // Else (it's '-'), decrement finalValue and break. 
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