//leetcode ques no 2011
https://leetcode.com/problems/final-value-of-variable-after-performing-operations/?envType=daily-question&envId=2025-10-20

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(int i =0;i<operations.length;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                value--;
            }
            else{
                value++;
            }
        }
        return value;
    }
}
