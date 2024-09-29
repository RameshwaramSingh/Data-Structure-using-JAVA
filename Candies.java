package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for( int candy: candies){
            maxCandies = Math.max(maxCandies, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy:candies){
            if(candy+extraCandies>= maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Candies obj = new Candies();
        int[] candies = {2,3,5,1,3};
        System.out.println(Arrays.toString(new List[]{obj.kidsWithCandies(candies, 3)}));
    }
}
