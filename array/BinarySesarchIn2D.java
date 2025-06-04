package com.priyanshu.array;
import java.util.*;
public class BinarySesarchIn2D {
    static boolean bs(int arr[][],int target){
        int m = arr.length;
        int n = arr[0].length;
        int low = 0;
        int high = (n*m-1);
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m; // imagining 2d matrices like 1d matrices and try find the coordinate with  help of this
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
                {3,4,7,9},
                {12,13,16,18},
                {20,21,23,39}
        };
        System.out.println("Enter the target you want to search");
        int target = sc.nextInt();
        Boolean result =  bs(arr,target);
        if(result == true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
