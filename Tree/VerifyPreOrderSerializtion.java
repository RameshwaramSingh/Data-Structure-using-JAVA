//leetcode ques no 331
https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/

class Solution {

    // in this we are counting the slot. A non null create two new slot and null node do not create any slot

    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int slots = 1;  // root slot
        
        for (String node : nodes) {
            slots--; // occupy one slot
            
            if (slots < 0) return false;
            
            if (!node.equals("#")) {
                slots += 2; // non-null node creates 2 new slots
            }
        }
        
        return slots == 0;
    }
}
