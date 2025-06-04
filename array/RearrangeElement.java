package com.priyanshu.array;
import java.util.*;
public class RearrangeElement {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrange(arr)));
    }
    static int[] rearrange(int arr[]){
        int pos[] = new int[arr.length/2];
        int neg[] = new int[arr.length/2];
        int res[] = new int[arr.length];
        int c=0;
        int k =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                pos[c] = arr[i];
                c++;
            }
            if(arr[i]<0){
                neg[k] = arr[i];
                k++;
            }
        }
        c =0;
        k=0;
        for(int i =0;i<arr.length;i++){
            if((i%2)==0){
                res[i] = pos[c];
                c++;
            }
            else if((i%2)!=0){
                res[i] = neg[k];
                k++;
            }
        }
        return res;
    }

}
