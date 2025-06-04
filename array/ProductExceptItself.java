package com.priyanshu.array;
import java.util.*;
public class ProductExceptItself {
    public static void main(String[] args) {
        int arr[] = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(moreOptimal(arr)));
    }
    static int[] product(int arr[]){
        int ans[] = new int[arr.length];
        int val =1;
        int c =0;
        for(int i =0; i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    val = val*arr[j];
                }
            }
            ans[c] = val;
            c++;
            val=1;
        }
        return ans;
    }


    static int[] optimal(int arr[]){
        int prefix[] = new int[arr.length];
        int suffix[] = new int[arr.length];
        int ans[] = new int[arr.length];
        prefix[0] = 1;
        suffix[arr.length-1] = 1;
        //prefix
        for(int i=1; i<arr.length;i++){
            prefix[i] = prefix[i-1]*arr[i-1];
        }

        //suffix
        for(int i =arr.length-2;i>=0;i--){
            suffix[i] = suffix[i+1]*arr[i+1];
        }

        for(int i =0;i<arr.length;i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }

    static int[] moreOptimal(int arr[]){
        int ans[] = new int[arr.length];
        ans[0] = 1;
        // this loop is used to calculate the suffix inside the ans array without using extra space
        for(int i=1; i<arr.length;i++){
            ans[i] = ans[i-1]*arr[i-1];
        }

        // this is used to multiply the ans with suffix without using extra space
        int suffix =1;
        for(int i =arr.length-2;i>=0;i--){
            suffix = suffix*arr[i+1];
            ans[i] = ans[i]*suffix;
        }

        return ans;
    }
}
