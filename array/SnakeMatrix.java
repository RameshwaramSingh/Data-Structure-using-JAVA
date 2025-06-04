package com.priyanshu.array;

import java.util.Scanner;

public class SnakeMatrix {
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
        snakeMatrix(arr);
    }
    static void snakeMatrix(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        for(int i =0;i<arr.length;i++){
                if(i%2==0){
                    for(int j=0;j<arr.length;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            else{
                for(int j = col-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                }
            System.out.println();
        }
    }
}
