class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int vowel = 0;
        int cons = 0;
        for(int i =0;i<freq.length;i++){
            char ch =  (char)(i+ 'a');
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                int currVowel = freq[i];
                if(currVowel>vowel){
                    vowel = currVowel;
                }
            }
            else{
                int currCons = freq[i];
                if(currCons>cons){
                    cons = currCons;
                }
            }
        }
        return vowel + cons;
    }
}
