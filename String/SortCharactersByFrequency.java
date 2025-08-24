// leetcode ques no 451
https://leetcode.com/problems/sort-characters-by-frequency/description/

class Solution {
    public String frequencySort(String s) {
        // step 1: count frequency of characters
        Map<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        // Step 2: convert string to character array for sorting
        Character[] chars = new Character[s.length()];
        for(int i =0; i<s.length(); i++){
            chars[i] = s.charAt(i);
        }

        // Step 3: Sort by frequency high to low
        Arrays.sort(chars,(a,b)->{
            // lambda function
            int f1 = freq.get(a);
            int f2 = freq.get(b);
            if(f1==f2) return a-b; // optional: tie breaking by char
            return f2-f1;
        });

        // Step 4: Build result
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            sb.append(c);
        }
        return sb.toString();
    }
}
