package com.priyanshu.String;

import java.lang.*;


//https://leetcode.com/problems/sorting-the-sentence/
public class SortingTheSentence {
    static String sortSentence(String s) {
        String[] str = s.split(" ");
        String res[] = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i =0;
        for(String elem: str){
            i = (int) (elem.charAt(elem.length()-1)-'0');
            res[i-1] = elem.substring(0,elem.length()-1);
        }
        for(i = 0;i<res.length-1;i++){
            sb.append(res[i]).append(" ");
        }
        sb.append(res[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
