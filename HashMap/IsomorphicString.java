class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=ch2){
                    return false;
                }
            }
            else{
                map.put(ch,ch2);
            }
            if(map2.containsKey(ch2)){
                if(map2.get(ch2)!=ch){
                    return false;
                }
            }
            else{
                map2.put(ch2,ch);
            }
        }
        return true;
    }
}
