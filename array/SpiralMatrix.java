package com.priyanshu.array;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> ans = new ArrayList<>();
        ans = spiral(mat);
        System.out.println(ans);
    }
    static List<Integer> spiral(int arr[][]){
        List<Integer> ans = new ArrayList<>();
        int row = arr.length;
        int col= arr[0].length;
        int srow =0,scol = 0,endrow = row-1,endcol = col-1;
        while(srow<=endrow && scol<=endcol){

            // top boundaary
            for(int i = scol;i<=endcol;i++){
                ans.add(arr[srow][i]);
            }

            //right boundary
            for(int i =srow+1;i<=endrow;i++){
                ans.add(arr[i][endcol]);
            }

            //bottom boundary
            for(int i =endcol-1;i>=scol;i--){
                if(srow==endrow){
                    break;
                }
                ans.add(arr[endrow][i]);
            }

            //left boundary
            for(int i =endrow-1;i>=srow+1;i--){
                if(scol==endcol){
                    break;
                }
                ans.add(arr[i][scol]);
            }
            srow++;endrow--;scol++;endcol--;
        }
        return ans;
    }
}
