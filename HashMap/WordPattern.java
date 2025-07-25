
//leetcode ques no 290

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length) return false;

        for(int i =0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word))
                return false;
            }
            else{
                map.put(ch,word);
            }
            if(map2.containsKey(word)){
                if(map2.get(word)!=ch)
                return false;
            }
            else{
                map2.put(word,ch);
            }
        }
        return true;
    }
}
