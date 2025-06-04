package com.priyanshu.array;
import java.util.*;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int c = sc.nextInt();
        System.out.println("Enter the size of the column");
        int r = sc.nextInt();
        int  arr[][] = new int[c][r];
        System.out.println("Enter the element of the array");
        for(int i =0;i<c;i++){
            for(int j =0;j<r;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int res[][] = new int[arr[0].length][arr.length];
        transpose(arr,res);
    }
    static void transpose(int arr[][],int res[][]){
        int rows = arr.length;
        int col = arr[0].length;
        for(int i =0;i<rows;i++){
            for(int j =0;j<col;j++){
                res[j][i] = arr[i][j];
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
