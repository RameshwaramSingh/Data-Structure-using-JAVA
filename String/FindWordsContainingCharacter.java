
//leetcode ques no 2942

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
                if(c==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
