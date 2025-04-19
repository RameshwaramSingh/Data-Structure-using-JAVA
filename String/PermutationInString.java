//leetcode ques no 567

static boolean isFreqSame(int freq1[], int freq2[]){
        for(int i =0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    // in this technique we compare the freq of s1 string with s2 string by using sliding window
    //int this we use sliding window technique
    static boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(int i =0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int windowSize = s1.length(); // this is length of the sliding window
        for(int i =0;i<s2.length();i++){
            int windidx = 0, idx = i;
            int windFreq[] = new int[26];
            while(windidx<windowSize && idx<s2.length()){
                windFreq[s2.charAt(idx)-'a']++;
                windidx++;idx++;
            }
            if(isFreqSame(freq,windFreq)){
                return true;
            }
        }
        return false;
    }
