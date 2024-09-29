package com.priyanshu;

import java.util.*;
public class NumSystem_02 {
    Scanner sc = new Scanner(System.in);

    //PALINDROME NUMBER

    public void palindromeNum(){
        System.out.println("Enter the number you want to check whether it is palindrome or not");
        int num = sc.nextInt();
        int n = num;
        int ans = 0;
        if(n>9){
            while(n>0){
                int rem = n % 10;
                n = n/10;
                ans = ans * 10 + rem;
            }
        }
        if(ans == num){
            System.out.println(ans+" is palindrome number");
        }
        else System.out.println(ans+" is not palindrome number");
    }


    public void factor(){
        System.out.print("Enter the number ");
       int n = sc.nextInt();
        System.out.print("All the factors of "+n+" are:-> ");
           for (int i = 1; i <= n; i++) {
               if (n % i == 0) {
                   System.out.print(i+" ");
               }
           }
    }

    // SUM OF N NUMBER

    public void sum(){
        System.out.println("Enter the total number you want to sum");
        int n = sc.nextInt();
        int num[] = new int[n];
        int len = num.length;
        int i =0;
        for( i =0; i<=n-1; i++){
            System.out.println("Enter the "+ i +" number");
            num[i] =sc.nextInt();
        }
        System.out.println("array");
    }
    public static void main(String args[]){
        NumSystem_02 obj = new NumSystem_02();
        obj.factor();
    }
}
