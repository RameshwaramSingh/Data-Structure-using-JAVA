public class LongestRepeatingCharacterReplacement {
    static int characterReplacement(String s, int k) {
        int n = s.length();
        int[] charCount = new int[26];
        int start = 0;
        int maxLength = 0;
        int maxCount = 0;
        for(int end =0;end<n;end++){
            charCount[s.charAt(end)-'A']++;//0th index represent A and so on till z 
            int currentCharCount = charCount[s.charAt(end)-'A'];
            maxCount = Math.max(maxCount,currentCharCount);
            while(end-start-maxCount+1>k){
                charCount[s.charAt(start)-'A']--;
                start++;
            }
            maxLength = Math.max(maxLength,(end-start)+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
       String s = "AABABBA";
       int k = 1;
        System.out.println(characterReplacement(s,k));
    }
}
